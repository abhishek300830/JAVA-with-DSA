package Concepts.Recursion.Advanced_Recursion;
// find the Number of ways you can Invite N peoples to party , single or in pairs 
public class Invite_N_peoples_to_party {
    public static int callGuests(int n){
        if(n<=0){
            return 1;
        }

        //single call
        int single=callGuests(n-1);
        //pair call
        int pair=(n-1)*callGuests(n-2);
        return single+pair;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(callGuests(n));

    }
}
