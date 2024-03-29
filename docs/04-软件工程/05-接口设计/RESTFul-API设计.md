# 如何设计接口?(面向资源方式设计)

## 信息源 (官方网站)

[Google的API设计-重点推荐](https://cloud.google.com/apis/design/resources?hl=zh-cn)
[MicroSoft的REST API设计](https://github.com/microsoft/api-guidelines/tree/vNext)
[AZure有的Web API设计](https://learn.microsoft.com/zh-cn/azure/architecture/best-practices/api-design)

## 接口设计遇到的问题

在前后端开发中，经常遇到后台接口设计，以前按方法或功能设计接口。随着时间的推移，接口和方法越来越多，最终结果可能是形成一个庞大而混乱的 API 接口，因为开发者必须单独学习每种方法。显然，这既耗时又容易出错。为了解决这个问题，引入REST API，其核心原则是定义可以用少量方法控制的命名资源。这些资源和方法被称为 API 的“名词”和“动词”。使用 HTTP 协议时，资源名称自然映射到网址，方法自然映射到 HTTP 的 POST、GET、PUT、PATCH 和 DELETE。

## REST-API是什么?

（Representational State Transfer）REST API 是可单独寻址的“资源”（API 中的“名词”）的“集合”。资源通过资源名称被引用，并通过一组“方法”（也称为“动词）进行控制。包括 List、Get、Create、Update、Delete和部分“自定义方法”。

### 资源

面向资源的 API 通常被构建为资源层次结构，其中每个节点是一个“简单资源”或“集合资源”。通常被分别称为资源和集合。

- 一个集合包含相同类型的资源列表。 例如，一个用户拥有一组联系人。
- 资源具有一些状态和零个或多个子资源。 每个子资源可以是一个简单资源或一个集合资源。

#### 集合资源

#### 简单资源


### 方法

面向资源的 API 的关键特性是，强调资源（数据模型）甚于资源上执行的方法（功能）。典型的面向资源的 API 使用少量方法公开大量资源。方法可以是标准方法或自定义方法。标准方法有：**List**、**Get**、**Create**、**Update** 和 **Delete**。如果 API 能够映射到标准方法，则应该在 API 设计中使用该方法。对于不能映射到某一标准方法的功能，可以使用自定义方法。

## 接口设计的方法

- 确定 API 提供的资源类型。
- 确定资源之间的关系。
- 根据类型和关系确定资源名称方案。
- 确定资源架构。
- 将最小的方法集附加到资源。

## 示例

- 在我们接口中，一般都有用户这样的资源。比如微信中

## 接口设计原则

- 面向资源设计
- 基础方法
- 注意幂等原则

## 标准方法

| 标准方法 | HTTP映射 | HTTP请求正文 | HTTP响应正文 |
|  :--:   |  :--:   |    :--:    |   :--:   |
| list   | GET **collection** URL | 不适用 | 资源*列表 |
| get    | GET **resource** URL | 不适用 | 资源 |
| create | POST **collection** URL | 资源 | 资源 |
| update | PUT **collection** URL | 资源 | 资源 |
| delete | DELETE **resource** URL | 不适用 | 资源 |
