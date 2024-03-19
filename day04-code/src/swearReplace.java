public class swearReplace {
    public static void main(String[] args) {
        //敏感词替换
        String talk="玩的这么猜以后别玩了,TMDSB。";
        //设置敏感词汇库
        String[] swear={"TMD","SB","CMD"};
        for (int i = 0; i < swear.length; i++) {
            talk = talk.replace(swear[i],"***");
        }
        System.out.println(talk);
    }
}
