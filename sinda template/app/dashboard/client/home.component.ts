import { Component, OnInit, trigger, state, style, transition, animate } from '@angular/core';
import initDemo = require('../../../assets/js/charts.js');

import {ClientService} from '../../services/client.service';

import { Router } from "@angular/router";

@Component({
    selector: 'home-cmp',
    moduleId: module.id,
    templateUrl: 'home.component.html',
     providers: [ClientService],
})

export class HomeComponent implements OnInit{




clients : Client[];
n : any;
num_client : number;
nom_client : string;
etat : boolean;
p:Pack[];
partieAffiche : boolean;
partieAjout : boolean;
pAjout : Pack[];
pListPackForAjoutClient : Pack[] = [];
num_clientForAjout : number;
nom_clientForAjout : string;
etatForAjout : boolean;


constructor(private  clientService: ClientService,private route :Router){ }
   
    ngOnInit(){
     
     this.clientService.getAllClient()
         .subscribe ( posts =>
              {
                this.clients = posts;
              }
            );

    this.clientService.getAllPack().subscribe( posts => {this.pAjout = posts;});
            this.partieAffiche=true;
            this.partieAjout=false;
       
       
    }

    afficherPartieListe()
    {
        this.partieAffiche=true;
        this.partieAjout=false;
    }
    afficherPartieAjoutClient()
    {
        this.partieAffiche=false;
        this.partieAjout=true;
    }
    

    recupererIdClient(a : number)
    {
        this.n=a;
    }

    validerSupprimerClient(b : number)
    {
        this.clientService.supprimerClient(b).subscribe(posts=>
                  { })
    }





editClient(a)
{
    this.recupererIdClient(a);
    this.clientService.getClient(a)
              .subscribe ( posts =>
              {
                this.num_client=posts.num_client;
                this.nom_client=posts.nom_client;
                this.etat=posts.etat;
                this.p=posts.packs;
                

                
              });
}

validerEditClient()
{
    this.p=this.pListPackForAjoutClient;
    this.clientService.modifierClient(this.n,this.num_client  ,this.nom_client, this.etat,this.p)
            .subscribe ( posts =>
              {
                 })



}




ajoutPackToClient(p : Pack,isChecked: boolean)
{
    if(isChecked) {
    this.pListPackForAjoutClient.push(p);
  } else {
    let index = this.pListPackForAjoutClient.findIndex(x => x.id_pack == p.id_pack);
    this.pListPackForAjoutClient.splice(index,1);

   
  }
   console.log(this.pListPackForAjoutClient);
}


ajouterClient()
{
    this.clientService.ajouterClient(this.num_clientForAjout,this.nom_clientForAjout,this.etatForAjout,this.pListPackForAjoutClient).subscribe( posts =>
              {
                 })
}




bloquerClient(isChecked: boolean)
{
    if(isChecked) {
    this.etat=false;
  } else {
    this.etat=true;

   
  }
   console.log(this.etat);
}


debloquerClient(isChecked: boolean)
{
    if(isChecked) {
    this.etat=true;
  } else {
    this.etat=false;

   
  }
   console.log(this.etat);
}



 
}



interface Client{
    id_client : number;
    num_client : number;
    nom_client : string;
    etat : string;
    packs : Pack[];

}

interface Pack{
    id_pack : number;
    nom_pack : string;
    description : string;
    nbre_max_service : number;
    kilometrage_max : number;
    etat : string;
}