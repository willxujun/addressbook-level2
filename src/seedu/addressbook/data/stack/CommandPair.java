package seedu.addressbook.data.stack;

import seedu.addressbook.data.person.Person;

/*
    This class is to be instantiated and stored in undoStack.
    Every add or delete command will generate a CommandPair containing the added/ deleted Person, as well as the isAdded flag (indicating
    whether he was added or deleted). This CommandPair will then be stored in undoStack for subsequent undo's to read and generate a reverse command
    to achieve undo action.
 */
public class CommandPair {
    private Person person;
    private int isAdd;

    public CommandPair(Person person, int isAdd) {
        this.person = person;
        this.isAdd = isAdd;
    }

    public Person getPerson() {
        return person;
    }

    public int isAdd() {
        return isAdd;
    }
}