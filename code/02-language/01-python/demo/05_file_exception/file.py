from pathlib import Path
import json

# 1. 文件读写
path = Path("sample.txt")
content = path.read_text()

lines = content.splitlines()
for line in lines:
    print(line)


# 2. 异常处理'
# Json文件读写
try:
    path = Path("sample.json")
    content = path.read_text()
    json_content = json.loads(content)
    print(json_content)
except FileNotFoundError:
    print("File not found")
else:
    print("File found")



