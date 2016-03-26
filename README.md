# design-pattern
什么要变把它写成接口意为着可被替换
1 Abstract factory pattern https://en.wikipedia.org/wiki/Abstract_factory_pattern
2 Builder                  https://en.wikipedia.org/wiki/Builder_pattern
{
new StreetMap.Builder(new Point(50, 50), new Point(100,
				100)).landColor(Color.GRAY).waterColor(Color.BLUE.brighter())
				.build();
}
3 factory method            https://en.wikipedia.org/wiki/Factory_method_pattern

4 prototype                 https://en.wikipedia.org/wiki/Prototype_pattern
5 singleton                https://en.wikipedia.org/wiki/Singleton_pattern



Structural
6 adapter                   https://en.wikipedia.org/wiki/Adapter_pattern
7 bridge                    https://en.wikipedia.org/wiki/Bridge_pattern
把继承转为聚合/组合,少用继承多少组合
8 composite                 https://en.wikipedia.org/wiki/Composite_pattern
层次结构,以相同方式处理 文件和目录 andiroid中 view/viewgroup
9 decorator                 https://en.wikipedia.org/wiki/Decorator_pattern
动态地给一个对象添加一些额外的职责或者行为
10 facade                   https://en.wikipedia.org/wiki/Facade_pattern
11 flyweight                https://en.wikipedia.org/wiki/Flyweight_pattern
在享元模式中通常会出现工厂模式，需要创建一个享元工厂来负责维护一个享元池(Flyweight Pool)用于存储具有相同内部状态的享元对象。
在享元模式中共享的是享元对象的内部状态，外部状态需要通过环境来设置
12 proxy                    https://en.wikipedia.org/wiki/Proxy_pattern



Behavioral
13 chain responsibility     https://en.wikipedia.org/wiki/Chain-of-responsibility_pattern
当一个请求可以被多个对象处理，同时又无法确定到底有谁来处理该请求，这时，我们就需要让该请求在这些对象之间一个个的接力，如果当前对象可以处理请求则处理它，否则，传递给下一个对象处理。这就是责任链模式的思想
handle(IRequest)
14 command                  https://en.wikipedia.org/wiki/Command_pattern
命令模式可以对发送者和接收者完全解耦，发送者与接收者之间没有直接引用关系，发送请求的对象只需要知道如何发送请求，而不必知道如何完成请求
client 使用invover开关(持有不同command实现开灯,关灯,command 关联reciever灯) 执行 pressButton ,由开关 call command,command 执行灯的具体开或关
15 interprepter             https://en.wikipedia.org/wiki/Interpreter_pattern

16 iterator                 https://en.wikipedia.org/wiki/Iterator_pattern

17 mediator                 https://en.wikipedia.org/wiki/Mediator_pattern

controller是mvc中的mediator
18 memento                  https://en.wikipedia.org/wiki/Memento_pattern

19 observer                 https://en.wikipedia.org/wiki/Observer_pattern

20 state                    https://en.wikipedia.org/wiki/State_pattern
状态和操作有类封装 接口state { handle()},不用if else

21 strategy                 https://en.wikipedia.org/wiki/Strategy_pattern
把可变部分算法写成接口转给 strategy接口的方法execute(算法接口)

22 template method          https://en.wikipedia.org/wiki/Template_method_pattern
abstract class 定义替则,步骤,子类写实现

23 visitor                  https://en.wikipedia.org/wiki/Visitor_pattern
可以解决集合中object如可访问问题,通过集合中元素实现Visitor{visit(Visitor o)}接口,把元素和操作关联起来,自己知道怎么访问