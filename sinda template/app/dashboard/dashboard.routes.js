"use strict";
var home_component_1 = require('./client/home.component');
var pack_component_1 = require('./pack/pack.component');
var gouvernorat_component_1 = require('./gouvernorat/gouvernorat.component');
var marque_component_1 = require('./marque/marque.component');
var ville_component_1 = require('./ville/ville.component');
var typeService_component_1 = require('./typeService/typeService.component');
var remorqueur_component_1 = require('./remorqueur/remorqueur.component');
var upgrade_component_1 = require('./upgrade/upgrade.component');
exports.MODULE_ROUTES = [
    { path: 'clients', component: home_component_1.HomeComponent },
    { path: 'packs', component: pack_component_1.PackComponent },
    { path: 'marques', component: marque_component_1.MarqueComponent },
    { path: 'gouvernorats', component: gouvernorat_component_1.GouvernoratComponent },
    { path: 'villes', component: ville_component_1.VilleComponent },
    { path: 'typeService', component: typeService_component_1.TypeServiceComponent },
    { path: 'remorqueurs', component: remorqueur_component_1.RemorqueurComponent },
    { path: 'upgrade', component: upgrade_component_1.UpgradeComponent },
    { path: '', redirectTo: 'clients', pathMatch: 'full' }
];
exports.MODULE_COMPONENTS = [
    home_component_1.HomeComponent,
    pack_component_1.PackComponent,
    marque_component_1.MarqueComponent,
    gouvernorat_component_1.GouvernoratComponent,
    ville_component_1.VilleComponent,
    typeService_component_1.TypeServiceComponent,
    remorqueur_component_1.RemorqueurComponent,
    upgrade_component_1.UpgradeComponent
];
//# sourceMappingURL=dashboard.routes.js.map