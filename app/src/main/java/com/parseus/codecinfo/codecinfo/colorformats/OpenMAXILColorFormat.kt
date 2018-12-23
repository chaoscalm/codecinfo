package com.parseus.codecinfo.codecinfo.colorformats

import com.parseus.codecinfo.toHexHstring

@Suppress("EnumEntryName")
enum class OpenMAXILColorFormat(val value: Int) {

    OMX_COLOR_FormatUnused(0x00),
    OMX_COLOR_FormatMonochrome(0x01),
    OMX_COLOR_Format8bitRGB332(0x02),
    OMX_COLOR_Format12bitRGB444(0x03),
    OMX_COLOR_Format16bitARGB4444(0x04),
    OMX_COLOR_Format16bitARGB1555(0x05),
    OMX_COLOR_Format16bitRGB565(0x06),
    OMX_COLOR_Format16bitBGR565(0x07),
    OMX_COLOR_Format18bitRGB666(0x08),
    OMX_COLOR_Format18bitARGB1665(0x09),
    OMX_COLOR_Format19bitARGB1666(0x0A),
    OMX_COLOR_Format24bitRGB888(0x0B),
    OMX_COLOR_Format24bitBGR888(0x0C),
    OMX_COLOR_Format24bitARGB1887(0x0D),
    OMX_COLOR_Format25bitARGB1888(0x0E),
    OMX_COLOR_Format32bitBGRA8888(0x0F),
    OMX_COLOR_Format32bitARGB8888(0x10),
    OMX_COLOR_FormatYUV411Planar(0x11),
    OMX_COLOR_FormatYUV411PackedPlanar(0x12),
    OMX_COLOR_FormatYUV420Planar(0x13),
    OMX_COLOR_FormatYUV420PackedPlanar(0x14),
    OMX_COLOR_FormatYUV420SemiPlanar(0x15),
    OMX_COLOR_FormatYUV422Planar(0x16),
    OMX_COLOR_FormatYUV422PackedPlanar(0x17),
    OMX_COLOR_FormatYUV422SemiPlanar(0x18),
    OMX_COLOR_FormatYCbYCr(0x19),
    OMX_COLOR_FormatYCrYCb(0x1A),
    OMX_COLOR_FormatCbYCrY(0x1B),
    OMX_COLOR_FormatCrYCbY(0x1C),
    OMX_COLOR_FormatYUV444Interleaved(0x1D),
    OMX_COLOR_FormatRawBayer8bit(0x1E),
    OMX_COLOR_FormatRawBayer10bit(0x1F),
    OMX_COLOR_FormatRawBayer8bitcompressed(0x20),
    OMX_COLOR_FormatL2(0x21),
    OMX_COLOR_FormatL4(0x22),
    OMX_COLOR_FormatL8(0x23),
    OMX_COLOR_FormatL16(0x24),
    OMX_COLOR_FormatL24(0x25),
    OMX_COLOR_FormatL32(0x26),
    OMX_COLOR_FormatYUV420PackedSemiPlanar(0x27),
    OMX_COLOR_FormatYUV422PackedSemiPlanar(0x28),
    OMX_COLOR_Format18BitBGR666(0x29),
    OMX_COLOR_Format24BitARGB6666(0x2A),
    OMX_COLOR_Format24BitABGR6666(0x2B),
    OMX_COLOR_Format32bitABGR8888(0x2C),
    OMX_COLOR_FormatYVU420Planar(0x2D),
    OMX_COLOR_FormatYVU420PackedPlanar(0x2E),
    OMX_COLOR_FormatYVU420SemiPlanar(0x2F),
    OMX_COLOR_FormatYVU420PackedSemiPlanar(0x30),
    OMX_COLOR_FormatYVU422Planar(0x31),
    OMX_COLOR_FormatYVU422PackedPlanar(0x32),
    OMX_COLOR_FormatYVU422SemiPlanar(0x33),
    OMX_COLOR_FormatYVU422PackedSemiPlanar(0x34),
    OMX_COLOR_Format8bitBGR233(0x35),
    OMX_COLOR_Format12bitBGR444(0x36),
    OMX_COLOR_Format16bitBGRA4444(0x37),
    OMX_COLOR_Format16bitBGRA5551(0x38),
    OMX_COLOR_Format18bitBGRA5661(0x39),
    OMX_COLOR_Format19bitBGRA6661(0x3A),
    OMX_COLOR_Format24bitBGRA7881(0x3B),
    OMX_COLOR_Format25bitBGRA8881(0x3C),
    OMX_COLOR_Format24BitBGRA6666(0x3D),
    OMX_COLOR_Format24BitRGBA6666(0x3E);


    companion object {
        fun from(findValue: Int) = OpenMAXILColorFormat.values().find { it.value == findValue }?.let {
            "${it.name} (${it.value.toHexHstring()})"
        }
    }

}