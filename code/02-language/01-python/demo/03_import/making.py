# import pizza 表示导入整个模块
import pizza

# 通过模块名引用一个特定函数，在可用别名调用
import pizza as pz

# 通过模块名引用一个特定函数，并使用as指定别名
from pie import get_pie as getPie

#  通过模块名使用函数
result =pizza.make_pizza(16, 'pepperoni', 'mushrooms', 'green peppers', 'extra cheese')
print(f" pizza is {result} ")

# 通过模块名引用一个特定函数
pz.make_pizza(18, 'module as')

# 通过模块名使用函数
getPie()
