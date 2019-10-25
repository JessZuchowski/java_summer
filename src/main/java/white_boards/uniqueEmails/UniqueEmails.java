package white_boards.uniqueEmails;

// https://leetcode.com/problems/unique-email-addresses/

/*
Given a list of emails, taking into account added "." or "+"
that will be forwarded to the same address, how many different
addresses will receive emails if one is sent to each address
on the list?
* */

import java.util.HashSet;
import java.util.Set;

public class UniqueEmails {

    public int numberOfUniques(String[] emails) {
        //keep track of seen emails in a hash set
        Set<String> seen = new HashSet<>();
        //for each email in array
        for (String email: emails) {
            int i = email.indexOf('@');
            //separate addresses into local vs others,
            String local = email.substring(0, i);
            String others = email.substring(i);
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf('+'));
            }
            //convert to the address that will receive the emails
            local = local.replaceAll(".", "");
            //add all uniques to hash set
            seen.add(local + others);
        }
        //return size of set
        return seen.size();
    }
}
