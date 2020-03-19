# JetBrains macOS Keymap for Windows and Linux

[Cheatsheet](Keymap-macOS%20For%20All.pdf)

This repo converts the lovely Mac OS X 10.5+ keymap in JetBrains
IDEs from macOS-specific bindings to ones without `meta` (i.e., the Command/splat/cloverleaf interchange from hell).

While some keybindings are close to their original, others have more modifier keys or different bindings altogether to avoid clashing.

## Build
Follow JetBrain's [guide](https://www.jetbrains.org/intellij/sdk/docs/tutorials/build_system/prerequisites.html) for using Gradle for plugins development. 

## Installation

Install the plugin from the [plugin marketplace](https://plugins.jetbrains.com/plugin/13968-macos-for-all) or
grab the zip file from the [latest release](https://github.com/samvtran/jetbrains-macos-keybindings-for-all/releases/latest) and install manually.

## Issues
If you notice any issues, please report them [here](https://github.com/samvtran/jetbrains-macos-keybindings-for-all/issues/new)!

## Key Updates

| Actions | Mac OS X 10.5+ Keybindings | New Keybindings |
| --: | -- | -- |
| ActivateMessageToolWindow | `Command-0` | `Alt-0` |
| ActivateProjectToolWindow | `Command-1` | `Alt-1` |
| ActivateFavoritesToolWindow | `Command-2` | `Alt-2` |
| ActivateFindToolWindow | `Command-3` | `Alt-3` |
| ActivateRunToolWindow | `Command-4` | `Alt-4` |
| ActivateDebugToolWindow | `Command-5` | `Alt-5` |
| ActivateTODOToolWindow | `Command-6` | `Alt-6` |
| ActivateStructureToolWindow | `Command-7` | `Alt-7` |
| ActivateHierarchyToolWindow | `Command-8` | `Alt-8` |
| ActivateVersionControlToolWindow | `Command-9` | `Alt-9` |
| Back | `Command-[` <br> `Command-Alt-Left` | `Control-[` |
| ChangesView.Move | `Command-Shift-M` | `Control-Shift-M` |
| ChooseDebugConfiguration | `Control-Alt-D` | `Control-Alt-Shift-D` |
| ChooseRunConfiguration | `Control-Alt-R` | `Control-Alt-Shift-R` |
| CloseContent | `Command-W` | `Control-W` |
| Debug | `Control-D` | `Control-Alt-D` |
| Diff.NextChange | `Command-Shift-]`<br>`Control-Right` | `Control-Shift-]` |
| Diff.PrevChange | `Command-Shift-[`<br>`Control-Left` | `Control-Shift-[` |
| EditorCodeBlockEnd | `Command-Alt-]` | `Control-Alt-]` |
| EditorCodeBlockEndWithSelection | `Command-Alt-Shift-]` | `Control-Alt-Shift-]` |
| EditorCodeBlockStart | `Command-Alt-[` | `Control-Alt-[` |
| EditorCodeBlockStartWithSelection | `Command-Alt-Shift-[` | `Control-Alt-Shift-[` |
| EditorDeleteLine | `Command-Backspace` | `Control-Backspace` |
| EditorLineEnd | `Command-Right` | `Control-Right` |
| EditorLineEndWithSelection | `Command-Shift-Right` | `Control-Shift-End` |
| EditorLineStart | `Command-Left` | `Control-Left` |
| EditorLineStartWithSelection | `Command-Shift-Left` | `Control-Shift-Home` |
| EditorLookupDown | `Control-Down` | `Control-Alt-Down` |
| EditorLookupUp | `Control-Up` | `Control-Alt-Up` |
| EditorMatchBrace | `Control-M` | `Control-Alt-M` |
| EditorToggleColumnMode | `Command-Shift-8` | `Control-Alt-Shift-8` |
| EditSource | `Command-Down` | `Control-Down` |
| EmojiAndSymbols | `Command-Control-Space` | `Control-Alt-Shift-Space` |
| Exit | `Command-Q` | `Control-Q` |
| ExpandAllToLevel1 | `Command-Alt-NumPad[*] + 1` | `Control-Alt-NumPad[*] + 1` |
| ExpandAllToLevel2 | `Command-Alt-NumPad[*] + 2` | `Control-Alt-NumPad[*] + 2` |
| ExpandAllToLevel3 | `Command-Alt-NumPad[*] + 3` | `Control-Alt-NumPad[*] + 3` |
| ExpandAllToLevel4 | `Command-Alt-NumPad[*] + 4` | `Control-Alt-NumPad[*] + 4` |
| ExpandAllToLevel5 | `Command-Alt-NumPad[*] + 5` | `Control-Alt-NumPad[*] + 5` |
| ExportToTextFile | `Control-O` | `Control-Shift-O` |
| FileChooser.TogglePathShowing | `Command-P` | `Control-P` |
| Find | `Command-F` | `Control-F` |
| FindInPath | `Command-Shift-F` | `Control-Shift-F` |
| FindNext | `Command-G` | `Control-Alt-G` |
| FindPrevious | `Command-Shift-G` | `Alt-Shift-G` |
| Forward | `Command-]` <br> `Command-Alt-Right` | `Control-]` |
| Generate | `Command-N` | `Control-N` |
| GotoChangedFile | `Command-O` | `Control-O` |
| GotoClass | `Command-O` | `Control-O` |
| GotoFile | `Command-Shift-O` | `Control-Shift-O` |
| GotoLine | `Command-L` | `Control-L` |
| GotoNextElementUnderCaretUsage | `Control-Alt-Down` | `Alt-Shift-Down` |
| GotoPrevElementUnderCaretUsage | `Control-Alt-Up` | `Alt-Shift-Up` |
| GotoRelated | `Control-Meta-Up` | `Control-Shift-Up` |
| GotoSymbol | `Command-Alt-O` | `Control-Alt-O` |
| GoToTypeDeclaration | `Command-Shift-B` <br> `Control-Shift-B` <br> `Command-Shift-button1` | `Control-Shift-B` <br> `Control-Shift-button` |
| MethodDown | `Control-Down` | `Control-Alt-Down` |
| MethodUp | `Control-Up` | `Control-Alt-Up` |
| MinimizeCurrentWindow | `Command-M` | `Control-M` |
| NewElement | `Command-N` | `Control-N` |
| NewScratchFile | `Command-Shift-N` | `Control-Shift-N` |
| NextEditorTab | `Control-Shift-Right` | `Control-Alt-Shift-Right` |
| NextProjectWindow | ``Command-Alt-` `` | ``Control-Alt-` `` |
| NextTag | `Command-Shift-]`<br>`Control-Right` | `Control-Shift-]` |
| OptimizeImports | `Control-Alt-O` | `Control-Alt-Shift-O` |
| OverrideMethods | `Control-O` | `Alt-Shift-O` |
| PreviousEditorTab | `Control-Shift-Left` | `Control-Alt-Shift-Left` |
| PreviousProjectWindow | ``Command-Alt-Shift-` `` | ``Control-Alt-Shift-` `` |
| PreviousTab | `Command-Shift-[`<br>`Control-Left` | `Control-Shift-[` |
| QuickImplementations | `Command-Y` | `Control-Y` |
| Refresh | `Command-R` | `Control-R` |
| ReplaceInPath | `Command-Shift-R` | `Control-Shift-R` |
| Rerun | `Command-R` | `Control-R` |
| Run | `Control-R` | `Control-Alt-R` |
| RunClass | `Control-Shift-R` | `Control-Shift-C` |
| RunDashboard.ShowConfigurations | `Command-Shift-T` | `Control-Shift-T` |
| SafeDelete | `Command-Delete` | `Control-Delete` |
| SearchEverywhere.NavigateToNextGroup | `Command-Down` | `Control-Down` |
| SearchEverywhere.NavigateToPrevGroup | `Command-Up` | `Control-Up` |
| SelectAllOccurrences | `Command-Control-G` | `Control-Alt-Shift-G` |
| ShowBookmarks | `Command-F3` | `Control-F3` |
| ShowContent | `Control-Down` | `Control-Shift-Down` |
| ShowNavBar | `Command-Up` | `Control-Up` |
| ShowProjectStructureSettings | `Command-;` | `Control-;` |
| ShowSettings | `Command-,` | `Control-,` |
| TestGestureAction | `Command-1` | `Control-Alt-1` |
| ToggleFullScreen | `Command-Control-F` | `Control-Alt-Shift-F` |
| Undo | `Command-Z` | `Control-Z` |
| Vcs.MoveChangedLinesToChangelist | `Command-Shift-M` | `Control-Shift-M` |
| Vcs.QuickListPopupAction | `Control-V` | `Control-Shift-V` |
| Vcs.ShowMessageHistory | `Command-E` | `Control-E` |
| Vcs.UpdateProject | `Command-T` | `Control-Alt-Shift-T` |
| VcsHistory.ShowAllAffected | `Command-Control-A` | `Control-Alt-A` |
| ZoomCurrentWindow | `Command-Control-=` | `Control-=` |

## Removed Keybindings

| Actions | Mac OS X 10.5+ Keybindings | Alternatives |
| -- | -- | -- |
| $Delete | `Command-Backspace` | Just backspace... |
| ActivateVersionControlToolWindow | `Command-Shift-9` | `Control-Alt-9` |
| CommentByBlockComment | `Command-Alt-/` <br> `Command-Shift-/` |  `Control-Shift-/` |
| EditorDown | `Control-N` | `Down` |
| EditorLeft | `Control-B` | `Left` |
| EditorLineEnd | `Control E` | `Control-Right` <br> `End` |
| EditorLineStart | `Control-A` | `Control-Left` <br> `Home` |
| EditorRight | `Control-F` | `Right` |
| EditorToggleColumnMode | `Command-Shift-NumPad[*]` | `Control-Alt-Shift-8` |
| EditorUp | `Control-P` | `Up` |
| FindNext | `Control-L` | `F3` |
| FindPrevious | `Control-Shift-L` | `Shift-F3` |
| RerunTests | `Command-Control-R` | `Shift-Alt-R` |
| Resume | `Command-Alt-R` | `F9` |
| Vcs.ShowMessageHistory | `Control-M` | `Control-E` | 

