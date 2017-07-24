"use strict";
var home_component_1 = require('./client/home.component');
var pack_component_1 = require('./pack/pack.component');
var icons_component_1 = require('./icons/icons.component');
var marque_component_1 = require('./marque/marque.component');
var notifications_component_1 = require('./notifications/notifications.component');
var typeService_component_1 = require('./typeService/typeService.component');
var maps_component_1 = require('./maps/maps.component');
var upgrade_component_1 = require('./upgrade/upgrade.component');
exports.MODULE_ROUTES = [
    { path: 'clients', component: home_component_1.HomeComponent },
    { path: 'packs', component: pack_component_1.PackComponent },
    { path: 'marques', component: marque_component_1.MarqueComponent },
    { path: 'icons', component: icons_component_1.IconsComponent },
    { path: 'notifications', component: notifications_component_1.NotificationsComponent },
    { path: 'typeService', component: typeService_component_1.TypeServiceComponent },
    { path: 'maps', component: maps_component_1.MapsComponent },
    { path: 'upgrade', component: upgrade_component_1.UpgradeComponent },
    { path: '', redirectTo: 'clients', pathMatch: 'full' }
];
exports.MODULE_COMPONENTS = [
    home_component_1.HomeComponent,
    pack_component_1.PackComponent,
    //TableComponent,
    marque_component_1.MarqueComponent,
    icons_component_1.IconsComponent,
    notifications_component_1.NotificationsComponent,
    //TypographyComponent,
    typeService_component_1.TypeServiceComponent,
    maps_component_1.MapsComponent,
    upgrade_component_1.UpgradeComponent
];
//# sourceMappingURL=dashboard.routes.js.map