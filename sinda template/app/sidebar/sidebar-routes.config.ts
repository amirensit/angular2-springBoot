import {  RouteInfo } from './sidebar.metadata';

export const ROUTES: RouteInfo[] = [
    { path: 'clients', title: 'Gestion des clients',  icon: 'person', class: '' },
    
    { path: 'packs', title: 'Gestion des packs',  icon:'dashboard', class: '' },
    { path: 'marques', title: 'marques',  icon:'content_paste', class: '' },
   // { path: 'table', title: 'tables',  icon:'content_paste', class: '' },
    //{ path: 'typography', title: 'Typography',  icon:'library_books', class: '' },
    { path: 'typeService', title: 'type de service',  icon:'library_books', class: '' },
    { path: 'icons', title: 'Icons',  icon:'bubble_chart', class: '' },
    { path: 'maps', title: 'Maps',  icon:'location_on', class: '' },
    { path: 'notifications', title: 'Notifications',  icon:'notifications', class: '' },
    { path: 'upgrade', title: 'Upgrade to PRO',  icon:'unarchive', class: 'active-pro' },
];
