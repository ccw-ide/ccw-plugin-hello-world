# ccw-plugin-hello-world

This project is the "Hello World" of Counterclockwise User Plugins.

This plugin's state is stable.

## Install

The `~/.ccw/` folder is where Counterclockwise searches for User Plugins.

It is recommended to layout User Plugins inside this folder by mirroring Github's namespacing. So if you clone laurentpetit/ccw-plugin-hello-world, you should do the following:

- Create a folder named `~/.ccw/laurentpetit/`
- Clone this project from `~/.ccw/laurentpetit/`

        mkdir -p ~/.ccw/laurentpetit
        cd ~/.ccw/laurentpetit
        git clone https://github.com/laurentpetit/ccw-plugin-hello-world.git

- If you have already installed ccw-plugin-manager (https://github.com/laurentpetit/ccw-plugin-manager.git), then type `Alt+U S` to re[S]tart User Plugins (and thus ccw-plugin-hello-world will be found and loaded)
- If you have not already installed ccw-plugin-manager, restart your Eclipse / Counterclockwise/Standalone instance.

## Usage

This User Plugin installs a keybinding which will open a Hello World Dialog: `Alt+U H`


## Workflow for modifying the plugin

If you haven't already, install ccw-plugin-manager (https://github.com/laurentpetit/ccw-plugin-manager.git). Go back here when it's done.

Once ccw-plugin-manager is installed, you can type `Alt+U I` to import all user plugins as projects in your running Eclipse workspace.

## License

Copyright © 2009-2015 Laurent Petit

Distributed under the Eclipse Public License, the same as Clojure.

