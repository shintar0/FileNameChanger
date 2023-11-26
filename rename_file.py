#!/usr/bin/env python3
import os
import sys

def rename_file(old_file_name, new_file_name):
    try:
        os.rename(old_file_name, new_file_name)
        print(f'ファイル名が {new_file_name} に変更されました。')
    except Exception as e:
        print(f'ファイル名の変更に失敗しました。エラー: {e}')

if __name__ == '__main__':
    if len(sys.argv) != 3:
        print('Usage: fnc <new_file_name> <old_file_name>')
    else:
        new_file_name = sys.argv[1]
        old_file_name = sys.argv[2]
        rename_file(old_file_name, new_file_name)
