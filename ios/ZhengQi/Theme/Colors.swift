// SwiftUI theme tokens generated from DESIGN.md
// Place inside ios/ZhengQi/Theme

import SwiftUI

extension Color {
    // Brand
    static let zqPrimary = Color(hex: "0066CC")
    static let zqPrimaryFocus = Color(hex: "0071E3")
    static let zqPrimaryOnDark = Color(hex: "2997FF")

    // Text
    static let zqInk = Color(hex: "1D1D1F")
    static let zqBody = Color(hex: "1D1D1F")
    static let zqBodyOnDark = Color.white
    static let zqBodyMuted = Color(hex: "CCCCCC")
    static let zqInkMuted80 = Color(hex: "333333")
    static let zqInkMuted48 = Color(hex: "7A7A7A")

    // Surfaces
    static let zqCanvas = Color(hex: "FFFFFF")
    static let zqCanvasParchment = Color(hex: "F5F5F7")
    static let zqSurfacePearl = Color(hex: "FAFAFC")
    static let zqSurfaceTile1 = Color(hex: "272729")
    static let zqSurfaceTile2 = Color(hex: "2A2A2C")
    static let zqSurfaceTile3 = Color(hex: "252527")
    static let zqSurfaceBlack = Color.black
}

// helper initializer
extension Color {
    init(hex: String) {
        let hex = hex.trimmingCharacters(in: CharacterSet.alphanumerics.inverted)
        var int: UInt64 = 0
        Scanner(string: hex).scanHexInt64(&int)
        let r, g, b: UInt64
        if hex.count == 6 {
            (r, g, b) = ((int >> 16) & 0xFF, (int >> 8) & 0xFF, int & 0xFF)
        } else {
            (r, g, b) = (0,0,0)
        }
        self.init(
            .sRGB,
            red: Double(r) / 255,
            green: Double(g) / 255,
            blue: Double(b) / 255,
            opacity: 1
        )
    }
}
