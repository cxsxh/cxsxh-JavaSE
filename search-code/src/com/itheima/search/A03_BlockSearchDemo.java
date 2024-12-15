package com.itheima.search;

public class A03_BlockSearchDemo {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 12, 21, 18,
                    32, 23, 37, 26, 45, 34,
                    50, 48, 61, 52, 73, 66};

        Block block1 = new Block(21, 0, 5);
        Block block2 = new Block(45, 6, 11);
        Block block3 = new Block(73, 12, 17);

        Block[] blocks = {block1, block2, block3};

        int number = 18;

        int index = getIndex(blocks, arr, number);

        System.out.println(index);
    }

    private static int getIndex(Block[] blocks, int[] arr, int number) {
        int indexBlock = findIndexBlock(blocks, number);

        if (indexBlock == -1) {
            return -1;
        }

        int StartIndex = blocks[indexBlock].getStartIndex();
        int EndIndex = blocks[indexBlock].getEndIndex();

        for (int i = StartIndex; i <= EndIndex; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    private static int findIndexBlock(Block[] blocks, int number) {
        for (int i = 0; i < blocks.length; i++) {
            if (number <= blocks[i].getMax()) {
                return i;
            }
        }
        return -1;
    }
}

class Block {
    private int Max;
    private int StartIndex;
    private int EndIndex;

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        Max = max;
        StartIndex = startIndex;
        EndIndex = endIndex;
    }

    public int getMax() {
        return Max;
    }

    public void setMax(int max) {
        Max = max;
    }

    public int getStartIndex() {
        return StartIndex;
    }

    public void setStartIndex(int startIndex) {
        StartIndex = startIndex;
    }

    public int getEndIndex() {
        return EndIndex;
    }

    public void setEndIndex(int endIndex) {
        EndIndex = endIndex;
    }
}
