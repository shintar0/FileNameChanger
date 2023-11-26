# FileNameChanger

# Configure

1 `~/.zshrc`にaliasを設定

```
alias fnc="/usr/bin/python3 /{path}/FileNameChanger/rename_file.py"
```

2 `~/.zshrc`を読み込み（もしくはターミナルを再起動）

```zsh
source ~/.zshrc
```

# Usage

```zsh
fnc {new_file_name} {old_file_name}
```