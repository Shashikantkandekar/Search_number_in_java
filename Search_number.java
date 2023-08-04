class Search_number{
    public static void main(String[] args) {
        int array [] = {10,20,30,40,50};
        int number =50;

        boolean flag =false;
        for(int i=0; i<=array.length-1; i++){
            if(array[i]==number){
                flag=true;
                System.out.println("Number  Found...");
            }

        }
        if(flag==false){
            System.out.println("Number Not Found...");
        }
    }
}