# feauters

**the syntax given below is abstract and may differ from the final implementation** 

## variants
variants by input enum object, example:
```
--- config ---
in vars reciever {
    friend, employee, girlfriend
}

--- input text ---
... and i want to say that i $(girlfriend: love; friend, employee: respect) you very much!

--- output text with reciever=friend ---
... and i want to say that i respect you very much!
```

## logic
lambda expressions for the conditional put part of text
```
--- config ---
in int age
opt in bool is_important_person: false

--- input text ---
children, you should all gather in the corridor, we will go on an excursion soon.
$- age < 18 & is_important_person: // check if is my child
And when we arrive, Mom will be waiting for us at home with a pie
-$

--- output text (age=13, is_important_person=true) ---
children, you should all gather in the corridor, we will go on an excursion soon.
And when we arrive, Mom will be waiting for us at home with a pie
```


## config file (or config in builder)
config with input definitions and lambda functions for logic and definitions enum

# realisation
pipeline:
 * create stack
 * push in stack parts of text(splitten by elements of logic)
 * get arguments
 * evaluate each part of text
 * join parts to a single text
