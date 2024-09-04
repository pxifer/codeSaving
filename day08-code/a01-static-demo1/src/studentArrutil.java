import java.util.ArrayList;

public class studentArrutil {
    private studentArrutil(){};
    public static int getMaxAge(ArrayList<student> list){
        int max=list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            if(max<list.get(i).getAge()){
                max=list.get(i).getAge();
            }
        }
        return max;
    }
}
