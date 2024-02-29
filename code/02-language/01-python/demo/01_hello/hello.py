# Date: 2022/04/05

message = "hello python world!"
print(message)

# 增加变量，同时将变量的值改为大写
message = "hello python crash course world!"
print(message.title())

# 在字符串中使用变量
first_name = "ada"
last_name = "lovelace"
# 使用f字符串, f字符串是一种在字符串中嵌入变量值的方式, f是format的缩写
full_name = f"{first_name} {last_name} "
print(f"Hello, {full_name.title()}, are you ready to learn some python today?")

#删除字符串的前缀
favorite_language = 'https://www.python.org'
netadress = favorite_language.removeprefix('https://')
print(netadress)

