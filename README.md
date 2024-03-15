# SpringBoot Application - Docker / MySQL / JWT / SpringSecurity

## prerequisites:
1. Install ```Docker```
2. Make sure all `dependencies` are there. If not, you can find necessary `dependencies` from `Maven` repository
3. Make changes to your `Dockerfile` or `doker-compose` files according to your needs.

This is a boilerplate project for you to kickstart your `SpringBoot` application.
Technologies used:
- `Java - SpringBoot`
- `MySQL`
- `JWT`
- `Docker`

`Dockerfile` specified in this project is multi-stage build, it will build your application first and then
moves your package `app.jar` into your runtime environment. 
