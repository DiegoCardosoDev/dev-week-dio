import { Regiao } from './../model/regiao';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RegiaoService {

  constructor() { }

  listRegioes(): Regiao[]{
    return[
      { id: 1, regiao: 'Norte', total_exames: 1554  }
    ];
  }
}
