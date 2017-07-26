import {  RouteInfo } from './sidebar.metadata';

export const ROUTES: RouteInfo[] = [
    { path: 'clients', title: 'Gestion des clients',  icon: 'person', class: '' },
    
    { path: 'packs', title: 'Gestion des packs',  icon:'dashboard', class: '' },
    { path: 'marques', title: 'marques',  icon:'content_paste', class: '' },
    { path: 'typeService', title: 'type de service',  icon:'library_books', class: '' },
    { path: 'gouvernorats', title: 'gouvernorats',  icon:'bubble_chart', class: '' },
    { path: 'villes', title: 'villes',  icon:'bubble_chart', class: '' },
    { path: 'remorqueurs', title: 'remorqueurs',  icon:'location_on', class: '' },
    { path: 'notifications', title: 'Notifications',  icon:'notifications', class: '' },
    { path: 'upgrade', title: 'Upgrade to PRO',  icon:'unarchive', class: 'active-pro' },
    
];
