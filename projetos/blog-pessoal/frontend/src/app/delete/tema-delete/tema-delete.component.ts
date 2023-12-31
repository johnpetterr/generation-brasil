import { AlertasService } from '../../service/alertas.service';
import { environment } from 'frontend/src/environments/environment.prod';
import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { Tema } from 'frontend/src/app/model/tema';
import { TemaService } from 'frontend/src/app/service/tema.service';

@Component({
  selector: 'app-tema-delete',
  templateUrl: './tema-delete.component.html',
  styleUrls: ['./tema-delete.component.css'],
})
export class TemaDeleteComponent implements OnInit {
  tema: Tema = new Tema();
  idTema: number;

  constructor(
    private temaService: TemaService,
    private router: Router,
    private actRoute: ActivatedRoute,
    private alert: AlertasService
  ) {}

  ngOnInit() {
    if (environment.token == '') {
      this.router.navigate(['/entrar']);
    }

    this.idTema = this.actRoute.snapshot.params['id'];
    this.findByIdTema(this.idTema);
  }

  findByIdTema(id: number) {
    this.temaService.getByIdTema(id).subscribe((resp: Tema) => {
      this.tema = resp;
    });
  }

  apagar() {
    this.temaService.deleteTema(this.idTema).subscribe(() => {
      this.alert.showAlertDanger('Tema deletado com sucesso!');
      this.router.navigate(['/tema']);
    });
  }
}
