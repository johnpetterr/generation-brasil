import { TemaService } from 'frontend/src/app/service/tema.service';
import { Tema } from '../../model/tema';
import { environment } from '../../../environments/environment.prod';
import { PostagemService } from '../../service/postagem.service';
import { Router, ActivatedRoute } from '@angular/router';
import { Postagem } from '../../model/postagem';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-postagem-edit',
  templateUrl: './postagem-edit.component.html',
  styleUrls: ['./postagem-edit.component.css'],
})
export class PostagemEditComponent implements OnInit {
  postagem: Postagem = new Postagem();
  tema: Tema = new Tema();

  listarTemas: Tema[];
  idTema: number;

  constructor(
    private router: Router,
    private route: ActivatedRoute,
    private postagemService: PostagemService,
    private temaService: TemaService
  ) {}

  ngOnInit() {
    if (environment.token == '') {
      this.router.navigate(['/entrar']);
    }

    let id = this.route.snapshot.params['id'];
    this.findByIdPostagem(id);
    this.findAllTemas();
  }

  findByIdPostagem(id: number) {
    this.postagemService.getByIdPostagem(id).subscribe((resp: Postagem) => {
      this.postagem = resp;
    });
  }

  findByIdTema() {
    this.temaService.getByIdTema(this.idTema).subscribe((resp: Tema) => {
      this.tema = resp;
    });
  }

  findAllTemas() {
    this.temaService.getAllTema().subscribe((resp: Tema[]) => {
      this.listarTemas = resp;
    });
  }

  atualizar() {
    this.tema.id = this.idTema;
    this.postagem.tema = this.tema;

    this.postagemService
      .putPostagem(this.postagem)
      .subscribe((resp: Postagem) => {
        this.postagem = resp;
        alert('Postagem atualizada com sucesso!');
        this.router.navigate(['/home']);
      });
  }
}
