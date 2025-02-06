# LogUtil

LogUtil 是一个基于 Log4j2 的日志工具，旨在提供高效、可扩展的日志管理功能。

## 特性
- 轻量级，易于集成
- 基于 Log4j2，支持异步日志
- 可配置的日志格式
- 兼容 Java 8 及以上版本

## 项目结构
```
LogUtil/
├── .idea/                    # IDEA 项目配置文件
├── gradle/                   # Gradle Wrapper 相关文件
├── src/main/java/cn/langya/  # Java 源代码
│   ├── LogUtil.java          # 日志工具类
│   ├── Main.java             # 入口类
├── src/main/resources/       # 资源文件
│   ├── log4j2.xml            # Log4j2 配置文件
├── .gitignore                # Git 忽略文件
├── build.gradle.kts          # Gradle 构建脚本
├── settings.gradle.kts       # Gradle 设置文件
└── README.md                 # 项目说明文件
```

## 安装与使用
### 1. 克隆项目
```sh
git clone https://github.com/LangYa466/LogUtil.git
cd LogUtil
```

### 2. 构建项目
```sh
./gradlew build
```

### 3. 使用示例
```java
import cn.langya.LogUtil;

public class Main {
    public static void main(String[] args) {
        LogUtil.info("Hello, LogUtil!");
    }
}
```

## 配置
### 修改 `log4j2.xml`
可以自定义日志级别、输出格式、日志存储路径等。

## 贡献
如果你想贡献代码，欢迎提交 PR。

## 许可证
本项目采用 MIT 许可证

---
Author: [LangYa466](https://github.com/LangYa466)

