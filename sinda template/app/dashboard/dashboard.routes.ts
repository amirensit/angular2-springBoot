import { Route } from '@angular/router';
import { DashboardComponent } from './dashboard.component';
import { HomeComponent } from './client/home.component';

import { PackComponent } from './pack/pack.component';
import { GouvernoratComponent } from './gouvernorat/gouvernorat.component';

import { MarqueComponent } from './marque/marque.component';
import { VilleComponent } from './ville/ville.component';

import { TypeServiceComponent } from './typeService/typeService.component';
import { RemorqueurComponent } from './remorqueur/remorqueur.component';
import { UpgradeComponent } from './upgrade/upgrade.component';


export const MODULE_ROUTES: Route[] =[
    { path: 'clients', component: HomeComponent },
    
    { path: 'packs', component: PackComponent },
    
    { path: 'marques', component: MarqueComponent },
    { path: 'gouvernorats', component: GouvernoratComponent },
    { path: 'villes', component: VilleComponent },
    
    { path: 'typeService', component: TypeServiceComponent },
    { path: 'remorqueurs', component: RemorqueurComponent },
    { path: 'upgrade', component: UpgradeComponent },
    
    { path: '', redirectTo: 'clients', pathMatch: 'full' }
]

export const MODULE_COMPONENTS = [
    HomeComponent,
    
    PackComponent,
    
    MarqueComponent,
    GouvernoratComponent,
    VilleComponent,
   
    TypeServiceComponent,
    RemorqueurComponent,
    UpgradeComponent
    
]
