import { Route } from '@angular/router';
import { DashboardComponent } from './dashboard.component';
import { HomeComponent } from './client/home.component';

import { PackComponent } from './pack/pack.component';
import { IconsComponent } from './icons/icons.component';

import { MarqueComponent } from './marque/marque.component';
import { NotificationsComponent } from './notifications/notifications.component';

import { TypeServiceComponent } from './typeService/typeService.component';
import { MapsComponent } from './maps/maps.component';
import { UpgradeComponent } from './upgrade/upgrade.component';

export const MODULE_ROUTES: Route[] =[
    { path: 'clients', component: HomeComponent },
    
    { path: 'packs', component: PackComponent },
    
    { path: 'marques', component: MarqueComponent },
    { path: 'icons', component: IconsComponent },
    { path: 'notifications', component: NotificationsComponent },
    
    { path: 'typeService', component: TypeServiceComponent },
    { path: 'maps', component: MapsComponent },
    { path: 'upgrade', component: UpgradeComponent },
    { path: '', redirectTo: 'clients', pathMatch: 'full' }
]

export const MODULE_COMPONENTS = [
    HomeComponent,
    
    PackComponent,
    //TableComponent,
    MarqueComponent,
    IconsComponent,
    NotificationsComponent,
    //TypographyComponent,
    TypeServiceComponent,
    MapsComponent,
    UpgradeComponent
]
