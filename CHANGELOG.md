# Changelog

## [Unreleased]

[Unreleased]: https://github.com/samvtran/jetbrains-macos-keybindings-for-all/commits

### Removed
- `GoToChangedFile` which was removed from _all_ JetBrains keymaps
- `FindPrevWordAtCaret` which is explicitly unbound in the macOS keymap

### Changed
- Build dependencies updates
- Plugin signing added
- Adds GitHub Actions workflows
- `Ctrl+Alt+←` updated to `Back` and removed from `PrevSplitter`
- `Ctrl+Alt+→` updated to `Forward` and removed from `NextSplitter`
- `NextSplitter` updated to `Ctrl+Alt+Shift+PageDown`, similar to VS Code
- `PrevSplitter` updated to `Ctrl+Alt+Shift+PageUp`, similar to VS Code 
- `ExportToTextFile` updated to `Ctrl+Alt+Shift+O`, making `Ctrl+Alt+O` work for `GoToFile` when the Find pane is open

## [2.0.0] - 2020-09-24

### Added
- Updated to match latest keymap as of [367cd5f](https://github.com/JetBrains/intellij-community/blob/fb0eb45e7d27dffbb490030c623bcf65eb402aeb/platform/platform-resources/src/keymaps/Mac%20OS%20X%2010.5%2B.xml).
- Support new commit tool window (`Alt-0` when commit is active)

### Removed
- `ActivateTODOToolWindow` removed from keymap as of [b6eda](https://github.com/JetBrains/intellij-community/commit/24fe6c91cc91d51a2042737e9b7d01dd94305943#diff-8d8929a05e92b93072513b4727735c81) to make room for the Problems view.

### Fixed
- Keymap range set to 2020.2.* and beyond (no `untilBuild`)
- `NextSplitter` and `PrevSplitter` updated to prevent conflicts with Alt-Tab
