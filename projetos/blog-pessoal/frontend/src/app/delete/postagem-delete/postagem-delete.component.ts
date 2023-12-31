import { AlertasService } from '../../service/alertas.service';
import { environment } from '../../../environments/environment.prod';
import { ActivatedRoute, Router } from '@angular/router';
import { PostagemService } from '../../service/postagem.service';
import { Postagem } from '../../model/postagem';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-postagem-delete',
  templateUrl: './postagem-delete.component.html',
  styleUrls: ['./postagem-delete.component.css'],
})
export class PostagemDeleteComponent implements OnInit {
  postagem: Postagem = new Postagem();
  idPost: number;

  constructor(
    private postagemService: PostagemService,
    private route: ActivatedRoute,
    private router: Router,
    private alert: AlertasService
  ) {}

  ngOnInit() {
    window.scroll(0, 0);

    if (environment.token == '') {
      this.router.navigate(['/entrar']);
    }

    this.idPost = this.route.snapshot.params['id'];
    this.findByIdPostagem(this.idPost);
  }

  findByIdPostagem(id: number) {
    this.postagemService.getByIdPostagem(id).subscribe((resp: Postagem) => {
      this.postagem = resp;
    });
  }

  apagar() {
    this.postagemService.deletePostagem(this.idPost).subscribe(() => {
      this.alert.showAlertDanger('Postagem apagada com sucesso!');
      this.router.navigate(['/home']);
    });
  }
}
