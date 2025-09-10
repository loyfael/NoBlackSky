# NoBlackSky

Un mod Minecraft Fabric qui supprime le ciel noir qui apparaît lorsque le joueur se trouve sous la couche 63.

## Description

Dans Minecraft, quand le joueur descend en dessous d'une certaine altitude, un effet de "ciel noir" (void fog) apparaît pour indiquer qu'il s'approche du vide. Ce mod supprime cet effet visuel lorsque le joueur est sous la couche Y=63, permettant de voir le ciel normal même en profondeur.

## Fonctionnalités

- ✅ Supprime le ciel noir sous la couche 63
- ✅ Fonctionne côté client uniquement
- ✅ Compatible avec Minecraft 1.21.8
- ✅ Écrit en Kotlin avec Fabric

## Installation

1. Assurez-vous d'avoir Fabric Loader installé
2. Téléchargez le fichier `.jar` du mod depuis les releases
3. Placez le fichier dans votre dossier `mods`
4. Lancez Minecraft

## Dépendances

- Fabric Loader >=0.17.2
- Fabric API
- Fabric Language Kotlin
- Minecraft 1.21.8
- Java 21+

## Développement

Ce mod utilise des mixins pour intercepter le rendu du ciel dans la classe `WorldRenderer` et l'annuler lorsque le joueur est sous la couche 63.

### Structure du projet

```
src/
├── main/kotlin/loyfael/blacksky/
│   ├── NoBlackSky.kt                    # Point d'entrée principal
│   └── NoBlackSkyDataGenerator.kt       # Générateur de données
├── client/kotlin/loyfael/blacksky/
│   ├── NoBlackSkyClient.kt              # Point d'entrée client
│   └── mixin/client/
│       └── WorldRendererMixin.kt        # Mixin principal pour le rendu du ciel
```

### Compilation

```bash
./gradlew build
```

## Licence

CC0-1.0 - Domaine public
