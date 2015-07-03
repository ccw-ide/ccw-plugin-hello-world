# ccw-plugin-hello-world

This project is the "Hello World" of Counterclockwise User Plugins.

This plugin's state is stable.

## Install

The `~/.ccw/` folder is where Counterclockwise searches for User Plugins.

It is recommended to layout User Plugins inside this folder by mirroring Github's namespacing. So if you clone ccw-ide/ccw-plugin-hello-world, you should do the following:

- Create a folder named `~/.ccw/ccw-ide/`
- Clone this project from `~/.ccw/ccw-ide/`

        mkdir -p ~/.ccw/ccw-ide
        cd ~/.ccw/ccw-ide
        git clone https://github.com/ccw-ide/ccw-plugin-hello-world.git

- If you have already installed ccw-plugin-manager (https://github.com/ccw-ide/ccw-plugin-manager.git), then type `Alt+U S` to re[S]tart User Plugins (and thus ccw-plugin-hello-world will be found and loaded)
- If you have not already installed ccw-plugin-manager, restart your Eclipse / Counterclockwise/Standalone instance.

## Usage

This User Plugin installs a keybinding which will open a Hello World Dialog: `Alt+U H`


## Workflow for modifying the plugin

If you haven't already, install ccw-plugin-manager (https://github.com/laurentpetit/ccw-plugin-manager.git). Go back here when it's done.

Once ccw-plugin-manager is installed, you can type `Alt+U I` to import all user plugins as projects in your running Eclipse workspace.

You will see the user plugins appear as projects in the 'Package Explorer View', and a 'Repl View'. The Repl view is connected to your running Eclipse instance. This Repl View is called the "embedded REPL". You can find it anytime by searching for the term "embedded" in the `Quick Search` input text in the Toolbar.

This will allow you to live code User Plugins:

- Open the `ccw-plugin-hello-world/hello-world.clj` file
- Change the text of the hello world popup in the `greet` fn.
- With the cursor still inside the `greet` fn, Type `Cmd+Enter` on OSX or `Ctrl+Enter` on Windows/Linux to send the whole top-level form (the `greet defn`) to the REPL.
- Type `Alt+U H`: the popup that will appear should reflect your changes.

## Uninstall

To uninstall a User plugin, simply remove its directory. At the next Eclipse/Counterclockwise restart, it'll be gone.


## License

Copyright © 2009-2015 Laurent Petit

Distributed under the Eclipse Public License, the same as Clojure.

