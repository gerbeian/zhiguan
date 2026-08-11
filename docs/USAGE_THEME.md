# 使用说明 / USAGE

此提交将 DESIGN.md 中的设计 token 初步落地为 Android (Jetpack Compose) 与 iOS (SwiftUI) 的 theme scaffold，目的是：

- 统一颜色/排版/间距 token，便于后续在各页面逐步替换硬编码的样式。
- 给到简单示例（Preview / SwiftUI Preview）验证样式。

快速开始

- Android
  - 引入 Theme：在 Compose 的根 Composable 中使用 ZhiguanTheme { /* App content */ }
  - 常用 token：ZQColors.Primary / ZQTypography / ZQDimen.*

- iOS
  - 在 SwiftUI 中包裹根视图： ZhiguanTheme { ContentView() }
  - 常用 token：Color.zqPrimary / ZQTypography.body / ZQSpacing.*

迁移建议

1. 先把全局颜色与字体 token 替换到 theme（Primary, Ink, Canvas, SurfaceTile1 等）。
2. 将常用组件（PrimaryButton、Card、SearchInput）抽成可复用组件并引用 theme token。
3. 逐屏替换：每次替换提一个小 PR，包含 Preview 或截图用于视觉回归。

注意事项

- SF Pro 为苹果专有字体；在 Android 请用系统字体或引入替代（例如 Inter）。
- 暗色模式在此 scaffold 中提供基础支持；具体颜色策略需依据设计决定。

