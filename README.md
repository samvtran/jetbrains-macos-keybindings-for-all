# JetBrains macOS Keymap for Windows and Linux

[![JetBrains IntelliJ Plugins](https://img.shields.io/jetbrains/plugin/v/13968-macos-for-all?style=for-the-badge)](https://plugins.jetbrains.com/plugin/13968-macos-for-all)

[Cheatsheet](Keymap-macOS%20For%20All.pdf)

This plugin converts the macOS keymap (previously known as Mac OS X 10.5+) in JetBrains IDEs from
macOS-specific shortcuts to shortcuts without the Command (⌘) key for use on Windows and Linux.

While some keybindings are close to their original, others have more modifier keys or different
bindings altogether to avoid conflicts.

## Build

Follow
JetBrains' [guide](https://www.jetbrains.org/intellij/sdk/docs/tutorials/build_system/prerequisites.html)
for using Gradle for plugin development.

## Installation

Install the plugin from
the [plugin marketplace](https://plugins.jetbrains.com/plugin/13968-macos-for-all) or
grab the zip file from
the [latest release](https://github.com/samvtran/jetbrains-macos-keybindings-for-all/releases/latest)
and install manually.

## Release

For signing and releasing the plugin, this repo uses the environment variables outlined in the IntelliJ
Platform Plugin
Template [environment variables section](https://github.com/JetBrains/intellij-platform-plugin-template?tab=readme-ov-file#environment-variables):

| Name                   | Description                                   |
|------------------------|-----------------------------------------------|
| `PRIVATE_KEY`          | Certificate private key for signing           |
| `PRIVATE_KEY_PASSWORD` | Password for private key                      |
| `CERTIFICATE_CHAIN`    | Certificate chain for signing                 |
| `PUBLISH_TOKEN`        | Token for publishing to JetBrains Marketplace |

## Issues

If you notice any issues, please report
them [here](https://github.com/samvtran/jetbrains-macos-keybindings-for-all/issues/new)!

## Key Updates

|                              Actions | macOS Keybindings                                                     | New Keybindings                               |
|-------------------------------------:|-----------------------------------------------------------------------|-----------------------------------------------|
|            ActivateProjectToolWindow | `Command-1`                                                           | `Alt-1`                                       |
|          ActivateBookmarksToolWindow | `Command-2`                                                           | `Alt-2`                                       |
|               ActivateFindToolWindow | `Command-3`                                                           | `Alt-3`                                       |
|                ActivateRunToolWindow | `Command-4`                                                           | `Alt-4`                                       |
|              ActivateDebugToolWindow | `Command-5`                                                           | `Alt-5`                                       |
|       ActivateProblemsViewToolWindow | `Command-6`                                                           | `Alt-6`                                       |
|          ActivateStructureToolWindow | `Command-7`                                                           | `Alt-7`                                       |
|           ActivateServicesToolWindow | `Command-8`                                                           | `Alt-8`                                       |
|     ActivateVersionControlToolWindow | `Command-9`                                                           | `Alt-9`                                       |
|             ActivateCommitToolWindow | `Command-0`                                                           | `Alt-0`                                       |
|                                 Back | `Command-[` <br> `Command-Alt-Left`                                   | `Control-[` <br> `Control-Alt-Left`           |
|                     ChangesView.Move | `Command-Shift-M`                                                     | `Control-Shift-M`                             |
|             ChooseDebugConfiguration | `Control-Alt-D`                                                       | `Control-Alt-Shift-D`                         |
|               ChooseRunConfiguration | `Control-Alt-R`                                                       | `Control-Alt-Shift-R`                         |
|                         CloseContent | `Command-W`                                                           | `Control-W`                                   |
|                          ContextHelp | `Command-Shift-F1`                                                    | `Control-Shift-F1`                            |
|                                Debug | `Control-D`                                                           | `Control-Alt-D`                               |
|                      Diff.NextChange | `Command-Shift-]`<br>`Control-Right`                                  | `Control-Shift-]`                             |
|                      Diff.PrevChange | `Command-Shift-[`<br>`Control-Left`                                   | `Control-Shift-[`                             |
|                   EditorCodeBlockEnd | `Command-Alt-]`                                                       | `Control-Alt-]`                               |
|      EditorCodeBlockEndWithSelection | `Command-Alt-Shift-]`                                                 | `Control-Alt-Shift-]`                         |
|                 EditorCodeBlockStart | `Command-Alt-[`                                                       | `Control-Alt-[`                               |
|    EditorCodeBlockStartWithSelection | `Command-Alt-Shift-[`                                                 | `Control-Alt-Shift-[`                         |
|                     EditorDeleteLine | `Command-Backspace`                                                   | `Control-Backspace`                           |
|                        EditorLineEnd | `Command-Right`                                                       | `Control-Right`                               |
|           EditorLineEndWithSelection | `Command-Shift-Right`                                                 | `Control-Shift-End`                           |
|                      EditorLineStart | `Command-Left`                                                        | `Control-Left`                                |
|         EditorLineStartWithSelection | `Command-Shift-Left`                                                  | `Control-Shift-Home`                          |
|                     EditorLookupDown | `Control-Down`                                                        | `Control-Alt-Down`                            |
|                       EditorLookupUp | `Control-Up`                                                          | `Control-Alt-Up`                              |
|                     EditorMatchBrace | `Control-M`                                                           | `Control-Alt-M`                               |
|               EditorToggleColumnMode | `Command-Shift-8`                                                     | `Control-Alt-Shift-8`                         |
|                           EditSource | `Command-Down`                                                        | `Control-Down`                                |
|                      EmojiAndSymbols | `Command-Control-Space`                                               | `Control-Alt-Shift-Space`                     |
|                                 Exit | `Command-Q`                                                           | `Control-Q`                                   |
|                    ExpandAllToLevel1 | `Command-Alt-NumPad[*] + 1`                                           | `Control-Alt-NumPad[*] + 1`                   |
|                    ExpandAllToLevel2 | `Command-Alt-NumPad[*] + 2`                                           | `Control-Alt-NumPad[*] + 2`                   |
|                    ExpandAllToLevel3 | `Command-Alt-NumPad[*] + 3`                                           | `Control-Alt-NumPad[*] + 3`                   |
|                    ExpandAllToLevel4 | `Command-Alt-NumPad[*] + 4`                                           | `Control-Alt-NumPad[*] + 4`                   |
|                    ExpandAllToLevel5 | `Command-Alt-NumPad[*] + 5`                                           | `Control-Alt-NumPad[*] + 5`                   |
|                     ExportToTextFile | `Control-O`                                                           | `Control-Alt-Shift-O`                         |
|            FileChooser.TogglePathBar | `Command-P`                                                           | `Control-P`                                   |
|                                 Find | `Command-F`                                                           | `Control-F`                                   |
|                           FindInPath | `Command-Shift-F`                                                     | `Control-Shift-F`                             |
|                             FindNext | `Command-G`                                                           | `Control-Alt-G`                               |
|                         FindPrevious | `Command-Shift-G`                                                     | `Alt-Shift-G`                                 |
|                              Forward | `Command-]` <br> `Command-Alt-Right`                                  | `Control-]` <br> `Control-Alt-Right`          |
|                             Generate | `Command-N`                                                           | `Control-N`                                   |
|                            GotoClass | `Command-O`                                                           | `Control-O`                                   |
|                             GotoFile | `Command-Shift-O`                                                     | `Control-Shift-O`                             |
|                             GotoLine | `Command-L`                                                           | `Control-L`                                   |
|                          GotoRelated | `Control-Meta-Up`                                                     | `Control-Alt-Home`                            |
|                           GotoSymbol | `Command-Alt-O`                                                       | `Control-Alt-O`                               |
|                  GotoTypeDeclaration | `Command-Shift-B` <br> `Control-Shift-B` <br> `Command-Shift-button1` | `Control-Shift-B` <br> `Control-Shift-button` |
|                           MethodDown | `Control-Down`                                                        | `Control-Alt-Down`                            |
|                             MethodUp | `Control-Up`                                                          | `Control-Alt-Up`                              |
|                MinimizeCurrentWindow | `Command-M`                                                           | `Control-M`                                   |
|                           NewElement | `Command-N`                                                           | `Control-N`                                   |
|                       NewScratchFile | `Command-Shift-N`                                                     | `Control-Shift-N`                             |
|                        NextEditorTab | `Control-Shift-Right`                                                 | `Control-Alt-Shift-Right`                     |
|                    NextProjectWindow | ``Command-Alt-` ``                                                    | ``Control-Alt-` ``                            |
|                         NextSplitter | `Alt-Tab`                                                             | `Control-Alt-Shift-PageDown`                  |
|                              NextTab | `Command-Shift-]`<br>`Control-Right`                                  | `Control-Shift-]`                             |
|                      OptimizeImports | `Control-Alt-O`                                                       | `Control-Alt-Shift-O`                         |
|                      OverrideMethods | `Control-O`                                                           | `Alt-Shift-O`                                 |
|                    PreviousEditorTab | `Control-Shift-Left`                                                  | `Control-Alt-Shift-Left`                      |
|                         PrevSplitter | `Alt-Shift-Tab`                                                       | `Control-Alt-Shift-PageUp`                    |
|                PreviousProjectWindow | ``Command-Alt-Shift-` ``                                              | ``Control-Alt-Shift-` ``                      |
|                     PreviousSplitter | `Alt-Shift-Tab`                                                       | `Control-Alt-Right`                           |
|                          PreviousTab | `Command-Shift-[`<br>`Control-Left`                                   | `Control-Shift-[`                             |
|                 QuickImplementations | `Command-Y`                                                           | `Control-Y`                                   |
|                              Refresh | `Command-R`                                                           | `Control-R` <br> `Control-F5`                 |
|                        ReplaceInPath | `Command-Shift-R`                                                     | `Control-Shift-R`                             |
|                                Rerun | `Command-R`                                                           | `Control-R`                                   |
|                                  Run | `Control-R`                                                           | `Control-Alt-R`                               |
|                             RunClass | `Control-Shift-R`                                                     | `Control-Shift-C`                             |
|             ServiceView.ShowServices | `Command-Shift-T`                                                     | `Control-Shift-T`                             |
|                           SafeDelete | `Command-Delete`                                                      | `Control-Delete`                              |
| SearchEverywhere.NavigateToNextGroup | `Command-Down`                                                        | `Control-Down`                                |
| SearchEverywhere.NavigateToPrevGroup | `Command-Up`                                                          | `Control-Up`                                  |
|                 SelectAllOccurrences | `Command-Control-G`                                                   | `Control-Alt-Shift-G`                         |
|                        ShowBookmarks | `Command-F3`                                                          | `Control-F3`                                  |
|                          ShowContent | None                                                                  | `Control-Shift-Down`                          |
|                           ShowNavBar | `Command-Up`                                                          | `Control-Up`                                  |
|         ShowProjectStructureSettings | `Command-;`                                                           | `Control-;`                                   |
|                         ShowSettings | `Command-,`                                                           | `Control-,`                                   |
|                    TestGestureAction | `Command-1`                                                           | `Control-Alt-1`                               |
|                     ToggleFullScreen | `Command-Control-F`                                                   | `Control-Alt-Shift-F`                         |
|                                 Undo | `Command-Z`                                                           | `Control-Z`                                   |
|     Vcs.MoveChangedLinesToChangelist | `Command-Shift-M`                                                     | `Control-Shift-M`                             |
|             Vcs.QuickListPopupAction | `Control-V`                                                           | `Control-Shift-V`                             |
|               Vcs.ShowMessageHistory | `Command-E`                                                           | `Control-E`                                   |
|                    Vcs.UpdateProject | `Command-T`                                                           | `Control-Alt-Shift-T`                         |
|           VcsHistory.ShowAllAffected | `Command-Control-A`                                                   | `Control-Alt-A`                               |
|                    ZoomCurrentWindow | `Command-Control-=`                                                   | `Control-=`                                   |

## Removed Keybindings

|                         Actions | macOS Keybindings                      | Alternatives               |
|--------------------------------:|----------------------------------------|----------------------------|
|                         $Delete | `Command-Backspace`                    | Just backspace             |
|                            Back | `Command-Alt-Left`                     | `Control-[`                |
|           CommentByBlockComment | `Command-Alt-/` <br> `Command-Shift-/` | `Control-Shift-/`          |
|                      EditorDown | `Control-N`                            | `Down`                     |
|                      EditorLeft | `Control-B`                            | `Left`                     |
|                   EditorLineEnd | `Control-E`                            | `Control-Right` <br> `End` |
|                 EditorLineStart | `Control-A`                            | `Control-Left` <br> `Home` |
|              EditorPreviousWord | `Control-Alt-B`                        | `Alt-Left`                 |
| EditorPreviousWordWithSelection | `Control-Alt-Shift-B`                  | `Alt-Shift-Left`           |
|                  EditorNextWord | `Control-Alt-F`                        | `Alt-Right`                |
|     EditorNextWordWithSelection | `Control-Alt-Shift-F`                  | `Alt-Shift-Right`          |
|                     EditorRight | `Control-F`                            | `Right`                    |
|          EditorToggleColumnMode | `Command-Shift-NumPad[*]`              | `Control-Alt-Shift-8`      |
|                        EditorUp | `Control-P`                            | `Up`                       |
|                        FindNext | `Control-L`                            | `F3`                       |
|                    FindPrevious | `Control-Shift-L`                      | `Shift-F3`                 |
|                         Forward | `Command-Alt-Right`                    | `Control-]`
|                      RerunTests | `Command-Control-R`                    | `Alt-Shift-R`              |
|                          Resume | `Command-Alt-R`                        | `F9`                       |
|          Vcs.ShowMessageHistory | `Control-M`                            | `Control-E`                |

## Default Implicit Keybindings

These keybindings are set by the [
`$default`](https://github.com/JetBrains/intellij-community/blob/master/platform/platform-resources/src/keymaps/%24default.xml)
keymap
and are not currently included, even if the macOS keymap defines them explicitly.

|                                                    Actions | macOS Keybindings                                                      | $default Keybindings             |
|-----------------------------------------------------------:|------------------------------------------------------------------------|----------------------------------|
|                                    ActivateNuGetToolWindow | `Command-Alt-7`                                                        | `Alt-Shift-7`                    |
|                                ActivateUnitTestsToolWindow | `Command-Alt-8`                                                        | `Alt-Shift-8`                     |
|                              ChangesView.GroupBy.Directory | `Control-P`                                                            | `Control-Alt-P`                  |
|                                 ChangesView.GroupBy.Module | `Control-M`                                                            | `Control-Alt-M`                  |
|                                         Diff.ApplyLeftSide | `Control-Shift-Right`                                                  | `Alt-Shift-Right`                |
|                                        Diff.ApplyRightSide | `Control-Shift-Left`                                                   | `Alt-Shift-Left`                 |
|                                               ForceRefresh | `Command-Alt-Shift-R`                                                  | `Control-Shift-F5`               |
|                                            GoToDeclaration | `Command-B` <br> `Command-click` <br> `Middle click` <br> Force touch  | `Control-B` <br> `Control-click` |
|                                                RunToCursor | `Alt-F9` <br> Force touch                                              | `Alt-F9`                         |
|                             ServiceView.GroupByContributor | `Control-T`                                                            | `Control-Alt-T`                  |
|                           ServiceView.GroupByServiceGroups | `Control-P`                                                            | `Control-Alt-P`                  |
|                                 TodoViewGroupByShowModules | `Control-M`                                                            | `Control-Alt-M`                  |
|                                TodoViewGroupByShowPackages | `Control-P`                                                            | `Control-Alt-P`                  |
|                              TodoViewGroupByFlattenPackage | `Control-F`                                                            | `Control-Alt-C`                  |
|                                      ToggleAmendCommitMode | `Control-Alt-M`                                                        | `Alt-M`                          |
|                                      ToggleFindInSelection | `Control-Alt-E`                                                        | `Control-Alt-E`                  |
|                                  UsageFiltering.ReadAccess | `Control-R`                                                            | `Control-R`                      |
|                                 UsageFiltering.WriteAccess | `Control-W`                                                            | `Control-W`                      |
|                                     UsageFiltering.Imports | `Control-I`                                                            | `Control-I`                      |
|                                       UsageGrouping.Module | `Control-M`                                                            | `Control-Alt-M`                  |
|                                    UsageGrouping.Directory | `Control-P`                                                            | `Control-Alt-P`                  |
|                                    UsageGrouping.UsageType | `Control-T`                                                            | `Control-Alt-T`                  |
|                               UsageGrouping.FlattenModules | `Control-O`                                                            | `Control-Alt-O`                  |
|                                UsageGrouping.FileStructure | `Control-F`                                                            | `Control-Alt-F`                  |
|                           UsageGrouping.DirectoryStructure | `Control-D`                                                            | `Control-Alt-D`                  |

## Missing/no-op Keybindings

This list may change over time.

|               Actions | Keybindings                         | Reason                                                                                                                                                                                                                                                                                                                                                   |
|----------------------:|-------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| PrevWindow/NextWindow | ``Command+Shift+` ``/``Command+` `` | Workaround for [platform-specific issues](https://youtrack.jetbrains.com/issue/IDEA-217613). For Linux, use ``Alt-`​`` in supported WMs. For Windows, try [AltBacktick](https://github.com/akiver/AltBacktick) or [window-switcher](https://github.com/sigoden/window-switcher).                                                                         |
|       EmojiAndSymbols | `Command-Control-Space`             | This is rebound to `Control-Alt-Shift-Space` but [does not function outside macOS](https://github.com/JetBrains/intellij-community/blob/b69a466631b01c408897e1b9f4159f6632470a0b/platform/platform-impl/src/com/intellij/ide/actions/MacEmojiAndSymbolsInputAction.java). For Windows, use `Super+;` or `Super+.` to activate the built-in emoji picker. |

## FAQ

### Oh no! My favorite shortcut changed after an update! What do I do?

This project tries to follow the macOS keybindings (still called "Mac OS X 10.5+" in the JetBrains
codebase) as closely as possible.

As new UI elements and IDE features are added, JetBrains may add and remove keybindings to
better match their evolving feature set. If you find that your muscle memory is getting in the way
of a new binding, make a copy of this keymap for your own custom shortcuts.

### I just switched from macOS to Linux/Windows. What can I do to make the transition easier?

If you don't use Caps Lock very often, try rebinding it to Command on macOS and Control on Windows
and Linux for more consistent hand and finger positioning.

Use a plugin like [Key Promoter X](https://plugins.jetbrains.com/plugin/9792-key-promoter-x) to help
with learning new shortcuts.
