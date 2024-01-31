package org.example._2024_01_31;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;

public class CharsetEncoderEx {
    public static void main(String[] args) throws CharacterCodingException {
        // Создание объекта CharsetEncoder для кодировки UTF-8
        Charset charset = Charset.forName("UTF-8");
        CharsetEncoder encoder = charset.newEncoder();

        // 1. encode(CharBuffer, ByteBuffer, boolean)
        CharBuffer charBuffer = CharBuffer.wrap("Hello, world!");
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        encoder.encode(charBuffer, byteBuffer, true);

        // 2. flush(ByteBuffer)
        encoder.flush(byteBuffer);

        // 3. reset()
        encoder.reset();

        // 4. onMalformedInput(CodingErrorAction)
        encoder.onMalformedInput(CodingErrorAction.REPORT);

        // 5. onUnmappableCharacter(CodingErrorAction)
        encoder.onUnmappableCharacter(CodingErrorAction.REPORT);

        // 6. charset()
        Charset charsetFromEncoder = encoder.charset();
        System.out.println("Charset used by encoder: " + charsetFromEncoder);

        // 7. malformedInputAction()
        CodingErrorAction malformedInputAction = encoder.malformedInputAction();
        System.out.println("Malformed input action: " + malformedInputAction);

        // 8. unmappableCharacterAction()
        CodingErrorAction unmappableCharacterAction = encoder.unmappableCharacterAction();
        System.out.println("Unmappable character action: " + unmappableCharacterAction);

        // 9. averageBytesPerChar()
        float averageBytesPerChar = encoder.averageBytesPerChar();
        System.out.println("Average bytes per character: " + averageBytesPerChar);

        // 10. maxBytesPerChar()
        float maxBytesPerChar = encoder.maxBytesPerChar();
        System.out.println("Max bytes per character: " + maxBytesPerChar);

        // 11. encode(CharBuffer)
        CharBuffer inputBuffer = CharBuffer.wrap("Привет, мир!");
        ByteBuffer outputBuffer = encoder.encode(inputBuffer);
        byte[] encodedBytes = outputBuffer.array();
        System.out.println("Encoded bytes: " + new String(encodedBytes, charset));

        // 12. canEncode(char)
        boolean canEncodeChar = encoder.canEncode('A');
        System.out.println("Can encode 'A': " + canEncodeChar);

        // 13. encode(CharSequence)
        ByteBuffer encodedBuffer = encoder.encode(CharBuffer.wrap("Hello"));
        byte[] encodedArray = encodedBuffer.array();
        System.out.println("Encoded bytes: " + new String(encodedArray, charset));

        // 14. replacement()
        byte[] replacementBytes = encoder.replacement();
        System.out.println("Replacement bytes: " + new String(replacementBytes, charset));
    }
}
