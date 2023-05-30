package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositePatternExample {
    public static void main(String[] args) {
        Component root = new Composite("root");

        // 添加树枝节点和叶子节点
        Component branch1 = new Composite("branch1");
        Component branch2 = new Composite("branch2");
        Component leaf1 = new Leaf("leaf1");
        Component leaf2 = new Leaf("leaf2");
        Component leaf3 = new Leaf("leaf3");
        Component leaf4 = new Leaf("leaf4");

        root.add(branch1);
        root.add(branch2);
        branch1.add(leaf1);
        branch1.add(leaf2);
        branch2.add(leaf3);
        branch2.add(leaf4);

        // 递归显示整个树结构
        root.display(1);
        /**
         * 输出
         * root
         * -branch1
         * --leaf1
         * --leaf2
         * -branch2
         * --leaf3
         * --leaf4
         */
    }
}

abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void display(int depth);
}

// 叶子节点类
class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        // 叶子节点不能添加子节点，所以这里直接抛出异常
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        // 叶子节点没有子节点需要移除，所以这里直接抛出异常
        throw new UnsupportedOperationException();
    }

    @Override
    public void display(int depth) {
        // 输出叶子节点的名称和层级（使用"-"表示层级）
        System.out.println(repeat("-", depth) + name);
    }

    // repeat()函数是Java 11版本中新增的一个字符串方法，用于将当前字符串重复指定次数并返回一个新的字符串。
    // "-".repeat(depth)
    // 如果你的Java版本不支持repeat()函数，你可以使用以下代码实现相同的功能：
    public static String repeat(String str, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}

// 组合节点类
class Composite extends Component {
    private List<Component> childComponents = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        // 将子组件添加到组合节点的子节点列表中
        childComponents.add(component);
    }

    @Override
    public void remove(Component component) {
        // 将子组件从组合节点的子节点列表中移除
        childComponents.remove(component);
    }

    @Override
    public void display(int depth) {
        // 输出组合节点的名称和层级（使用"-"表示层级）
        System.out.println(repeat("-", depth) + name);

        // 递归显示所有子节点的内容
        for (Component c : childComponents) {
            c.display(depth + 1);
        }
    }

    public static String repeat(String str, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
