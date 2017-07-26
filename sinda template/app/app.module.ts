import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { HttpModule } from '@angular/http';
import { CustomFormsModule } from 'ng2-validation';

import { AppComponent }   from './app.component';
import { DashboardComponent } from './dashboard/dashboard.component';

import { DashboardModule } from './dashboard/dashboard.module';
import { SidebarModule } from './sidebar/sidebar.module';
import { FooterModule } from './shared/footer/footer.module';
import { NavbarModule} from './shared/navbar/navbar.module';

import { HashLocationStrategy, LocationStrategy ,CommonModule} from '@angular/common';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";



import {ClientService} from "./services/client.service";
import {RemorqueurService} from "./services/remorqueur.service";
import {PackService} from "./services/pack.service";
import {MarqueService} from "./services/marque.service";
import {TypeServiceService} from "./services/typeService.service";
import {GouvernoratService} from "./services/gouvernorat.service";
import {VilleService} from "./services/ville.service";
import { Ng2FilterPipeModule } from 'ng2-filter-pipe';


@NgModule({
    imports:      [
        CommonModule,
        HttpModule,
        FormsModule,
        ReactiveFormsModule,
        BrowserModule,
        DashboardModule,
        SidebarModule,
        NavbarModule,
        FooterModule,
        CustomFormsModule,
        Ng2FilterPipeModule,
        
        RouterModule.forRoot([])
    ],
    declarations: [ AppComponent, DashboardComponent ],
    providers: [{provide: LocationStrategy, useClass: HashLocationStrategy},ClientService,PackService,MarqueService,TypeServiceService,GouvernoratService,VilleService,RemorqueurService],
    bootstrap:    [ AppComponent ]
})
export class AppModule { }
