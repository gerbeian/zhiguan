import SwiftUI

// A lightweight Theme wrapper for SwiftUI usage.
// Usage: wrap root view with ZhiguanTheme { ContentView() }

struct ZhiguanTheme<Content: View>: View {
    var content: () -> Content

    init(@ViewBuilder content: @escaping () -> Content) {
        self.content = content
    }

    var body: some View {
        content()
            .environment(\._zqPrimaryColor, Color.zqPrimary)
            // additional environment keys can be added as needed
    }
}

// Example environment key (expand as necessary)
private struct ZQPrimaryColorKey: EnvironmentKey {
    static let defaultValue: Color = Color.zqPrimary
}

extension EnvironmentValues {
    var _zqPrimaryColor: Color {
        get { self[ZQPrimaryColorKey.self] }
        set { self[ZQPrimaryColorKey.self] = newValue }
    }
}

// A small preview example
struct ZhiguanTheme_Previews: PreviewProvider {
    static var previews: some View {
        ZhiguanTheme {
            VStack(spacing: ZQSpacing.lg) {
                Text("Primary button")
                    .font(ZQTypography.body)
                Button(action: {}) {
                    Text("Primary")
                        .frame(minWidth: 120, minHeight: ZQSpacing.touchMin)
                        .padding(.horizontal, 22)
                        .background(Color.zqPrimary)
                        .foregroundColor(.white)
                        .cornerRadius(999)
                }
            }
            .padding()
        }
        .previewLayout(.sizeThatFits)
    }
}
