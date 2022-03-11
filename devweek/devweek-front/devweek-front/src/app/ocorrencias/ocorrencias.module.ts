import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { OcorrenciasRoutingModule } from './ocorrencias-routing.module';
import { OcorrenciasComponent } from './ocorrencias/ocorrencias.component';


@NgModule({
  declarations: [
    OcorrenciasComponent
  ],
  imports: [
    CommonModule,
    OcorrenciasRoutingModule
  ]
})
export class OcorrenciasModule { }
