import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { MODULE_COMPONENTS, MODULE_ROUTES } from './dashboard.routes';
import {BrowserModule} from "@angular/platform-browser";
import {FormsModule, ReactiveFormsModule,} from "@angular/forms";
import {CommonModule} from '@angular/common';
import { Ng2FilterPipeModule } from 'ng2-filter-pipe';
import { CustomFormsModule } from 'ng2-validation'


@NgModule({
    imports: [
        CommonModule,
        BrowserModule,
        FormsModule,
        CustomFormsModule,
        Ng2FilterPipeModule,
        ReactiveFormsModule,
        RouterModule.forChild(MODULE_ROUTES)
    ],
    declarations: [ MODULE_COMPONENTS ]
})

export class DashboardModule{}
