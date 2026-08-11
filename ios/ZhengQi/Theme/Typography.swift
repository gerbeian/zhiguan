// Typography tokens for Zhiguan
// Uses system font fallbacks; replace with SF Pro if available

import SwiftUI

struct ZQTypography {
    static let heroDisplay = Font.system(size: 56, weight: .semibold)
    static let displayLG = Font.system(size: 40, weight: .semibold)
    static let displayMD = Font.system(size: 34, weight: .semibold)
    static let lead = Font.system(size: 28, weight: .regular)
    static let leadAiry = Font.system(size: 24, weight: .light)
    static let body = Font.system(size: 17, weight: .regular)
    static let bodyStrong = Font.system(size: 17, weight: .semibold)
    static let caption = Font.system(size: 14, weight: .regular)
    static let finePrint = Font.system(size: 12, weight: .regular)
}
