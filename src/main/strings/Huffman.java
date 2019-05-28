package main.strings;

import edu.princeton.cs.algs4.BinaryStdIn;
import edu.princeton.cs.algs4.BinaryStdOut;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 霍夫曼压缩
 * @date 2019/5/28 14:21
 */
public class Huffman {

    // ASCII字母表
    private static int R = 256;
    // Node内部类请见5.5.6.4节框注"单词查找树的结点表示"
    // 其他辅助方法和expand()方法请见正文

    public static void compress() {

        // 读取输入
        String s = BinaryStdIn.readString();
        char[] input = s.toCharArray();
        // 统计频率
        int[] freq = new int[R];
        for (int i = 0; i < input.length; i++) {
            freq[input[i]]++;
        }

        // 构造霍夫曼编码树
        //       Node root = buildTrie(freq);
        // (递归地)构造编译表
        String[] st = new String[R];
        //  buildCode(st, root, "");
        // (递归地)打印解码用的单词查找树
        //      writeTrie(root);
        // 打印字符总数
        BinaryStdOut.write(input.length);

        // 使用霍夫曼编码处理输入
        for (int i = 0; i < input.length; i++) {
            String code = st[input[i]];
            for (int j = 0; j < code.length(); j++)
                if (code.charAt(j) == 1)
                    BinaryStdOut.write(true);
                else BinaryStdOut.write(false);
        }

        BinaryStdOut.close();
    }


}
