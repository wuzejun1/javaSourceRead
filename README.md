# javaSourceRead


## 基础类实现

* String

```
	String 实现了java.lang.CharSequence 接口
		  它定义了一系列的行为:
		    略:length, charAt, subSequence,toString
		    chars[since1.8]: 可以获取String的char数组的编码值
		    codePoints[since1.8]: 这个函数跟chars的区别在于, 它对于high surrogate的码值展示是正确
	实现了Comparable<String> 接口 逻辑如下
	    对于String的每一位char比较码值大小，遇到第一组码值不相同时取差值
	    当其中一个String是另一个String的subString时，差值的意义变成长度差
	重要方法逻辑
	    hashCode s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
	    intern 这个方法会获取常量池里同值String的引用，如果没有的话会往常量池新增
	静态方法
	    join[since1.8] 使用指定分隔符链接若干CharSequence, String.join("_", "hello", "java", "String")//result: hello_java_String
	    format String.format("hi, now is %s", (Calendar.getInstance()).get(Calendar.YEAR))//result: hi, now is 2018

```
* [HashMap](HashMap.md)
