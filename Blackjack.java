import java.util.Map;
//import java.util.stream.Stream;

public class Blackjack {

    private static final Map<String, Integer> CARDS = Map.ofEntries(
        Map.entry("ace", 11),
        Map.entry("two", 2),
        Map.entry("three", 3),
        Map.entry("four", 4),
        Map.entry("five", 5),
        Map.entry("six", 6),
        Map.entry("seven", 7),
        Map.entry("eight", 8),
        Map.entry("nine", 9),
        Map.entry("ten", 10),
        Map.entry("jack", 10),
        Map.entry("queen", 10),
        Map.entry("king", 10)
    );


//System.out.print(CARDS);

    
    public int parseCard(String card) {
        //Card does not exist error handling
        if(!CARDS.containsKey(card)){
            throw new IllegalArgumentException(String.format("Unknown card '%s'", card));
        }
        //Returns integer value that represents the card
        return CARDS.get(card);
    }
    

    public boolean isBlackjack(String card1, String card2) {
        //Parse both cards, if the sum of their values is equal to 21, player has balckjack
        if(21 == (this.parseCard(card1) + this.parseCard(card2))) {
            return true;
        }
        //Player does not have blackjack
        return false;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        //If handScore is greater than 20 && isBlackjack == false hand consists of two aces and player must SPLIT
        if (!isBlackjack) {
            return "P";
        }
        //If dealerScore is less than 10, player AUTOMATICALLY WINS
        if (dealerScore < 10){
            return "W";
        }
        //Stand if these conditions cannot be met
        return "S";        
    }

    public String smallHand(int handScore, int dealerScore) {
        //Stand if handScore is greater than or equal to 17
        if (handScore >= 17) {
            return "S";
        }
        //Hit if handScore is less than or equal to 11
        if (handScore <= 11) {
            return "H";
        }
        //If dealerScore is greater than or equal to seven, player should hit; otherwise, stand
        return dealerScore >= 7 ? "H" : "S";
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
