# שיעור 7: תרשימי UML — תרגיל מעשי | Practical Exercise

## משימה כללית | General Task

בתרגיל זה תקבלו קוד Java קיים שמנהל רשימת קניות (**ShoppingList**). משימתכם היא:

1. **צללו את ה-UML** של הקוד הקיים (Class Diagram + Activity Diagram)
2. **בצעו שינוי נדרש**: הוסיפו שדה `priority` לכל פריט וגם מתודה לסידור לפי עדיפות
3. **עדכנו את ה-UML** כדי להשתקף את השינוי החדש
4. **קומיטו** את הקוד המעודכן וגם את התרשימים כתמונות

---

## מבנה הפרויקט | Project Structure

```
github-template/
├── README.md                    (קובץ זה)
├── OBSERVATIONS.md              (תבנית התבוננויות שלך)
├── QUESTIONS.md                 (5 שאלות תיאוריות)
└── app/
    └── src/main/java/com/example/shoppinglist/
        ├── ShoppingItem.java    (מחלקת פריט קניה)
        ├── ShoppingList.java    (מחלקת רשימת קניה)
        └── MainActivity.java    (Activity ראשי)
    └── src/main/res/layout/
        └── activity_main.xml    (Layout XML)
```

---

## שלבים לביצוע | Step-by-Step Instructions

### שלב 1: קרא את הקוד | Step 1: Read the Code

1. פתח את הקבצים:
   - `ShoppingItem.java` — מחלקה שמייצגת פריט יחיד
   - `ShoppingList.java` — מחלקה שמנהלת את הרשימה כולה
   - `MainActivity.java` — ה-Activity שמציג את הממשק למשתמש

2. הבן מה כל מחלקה עושה, אילו שדות (attributes) ואילו מתודות (methods) יש לה

**שאלות לעצמך:**
- כמה שדות יש בכל מחלקה?
- אילו מתודות הן public (+) ואילו private (-)?
- איך ShoppingList משתמשת ב-ShoppingItem?

---

### שלב 2: צור Class Diagram | Step 2: Draw Class Diagram

**כלים:** draw.io (https://draw.io) או Lucidchart (https://lucidchart.com)

**הוראות:**

1. פתח את draw.io:
   - גש ל-https://draw.io
   - לחץ על "Create New Diagram"
   - בחר "Blank Diagram"

2. בצע:
   - בחפש בחלונית השמאלית "UML" ודחוף את "Class" צורה
   - שרטט שתי Class boxes:
     - **Box 1: ShoppingItem**
       ```
       ┌──────────────────────────┐
       │     ShoppingItem         │
       ├──────────────────────────┤
       │ - name: String           │
       │ - quantity: int          │
       │ - purchased: boolean     │
       ├──────────────────────────┤
       │ + getName(): String      │
       │ + getQuantity(): int     │
       │ + isPurchased(): boolean │
       │ + setPurchased(boolean)  │
       │ + setQuantity(int)       │
       │ + toString(): String     │
       └──────────────────────────┘
       ```

     - **Box 2: ShoppingList**
       ```
       ┌──────────────────────────┐
       │    ShoppingList          │
       ├──────────────────────────┤
       │ - listName: String       │
       │ - items: List<...>       │
       ├──────────────────────────┤
       │ + addItem(ShoppingItem)  │
       │ + removeItem(String)     │
       │ + getItems(): List<...>  │
       │ + getPurchasedItems()    │
       │ + getTotalItems(): int   │
       │ + getListName(): String  │
       └──────────────────────────┘
       ```

3. הוסף קשר (Relationship):
   - צייר קו בין **ShoppingList** לבין **ShoppingItem**
   - הקו צריך להראות Composition (יהלום מלא ◆ בצד ShoppingList)
   - תווית הקו: "1" ליד ShoppingList, "*" ליד ShoppingItem

**טיפ:** משמעות הקשר:
- "1 ShoppingList" יכולה להיות לה "*" (אפס או יותר) ShoppingItems
- יהלום מלא (◆) פירושו: ShoppingItem לא יכול להיות בלי ShoppingList

4. שמור את התרשים:
   - File → Download as → PNG
   - שם הקובץ: `class-diagram-initial.png`

---

### שלב 3: צור Activity Diagram | Step 3: Draw Activity Diagram

**כלים:** draw.io או Lucidchart

**תרשים עבור: "User adds an item to the shopping list"**

צייר את התהליך הזה:

```
         ┌─────────────────────────┐
         │   [Start]  (●)          │
         └────────────┬────────────┘
                      │
                      ▼
         ┌─────────────────────────┐
         │ User opens app          │
         │ [Action box - rounded]  │
         └────────────┬────────────┘
                      │
                      ▼
         ┌─────────────────────────┐
         │ User enters item name   │
         │ and quantity            │
         └────────────┬────────────┘
                      │
                      ▼
         ┌─────────────────────────┐
         │ Click "Add Item" button │
         └────────────┬────────────┘
                      │
                      ▼
         ┌─────────────────────────┐
         │ ShoppingItem created    │
         │ with name, quantity     │
         └────────────┬────────────┘
                      │
                      ▼
         ┌─────────────────────────┐
         │ Item added to           │
         │ ShoppingList.items      │
         └────────────┬────────────┘
                      │
                      ▼
         ┌─────────────────────────┐
         │ Display list on screen  │
         └────────────┬────────────┘
                      │
                      ▼
         ┌─────────────────────────┐
         │   [End]  (⊙)            │
         └─────────────────────────┘
```

**צעדים:**

1. בדוק.io, חפש "Activity" בחלונית השמאלית
2. גרור את צורות:
   - `●` (Start) — filled circle
   - `[Action]` — rounded rectangle
   - `⊙` (End) — circle with dot inside
   - חיצים כדי לחבר ביניהם

3. תווית (Labels):
   - כל Action צריך לתאר מה קורה
   - השתמש בפעלים: "User enters", "Create", "Add", "Display"

4. שמור:
   - File → Download as → PNG
   - שם הקובץ: `activity-diagram-initial.png`

---

### שלב 4: בצע שינוי בקוד | Step 4: Implement Code Changes

**משימה:** הוסף Priority field

**שלב 4.1: עדכן ShoppingItem.java**

1. הוסף שדה חדש בראש המחלקה:
```java
private int priority;  // 1 = low, 5 = high
```

2. עדכן את ה-constructor כדי לקבל priority:
```java
public ShoppingItem(String name, int quantity, int priority) {
    this.name = name;
    this.quantity = quantity;
    this.priority = priority;
    this.purchased = false;
}
```

3. הוסף getter ו-setter:
```java
public int getPriority() {
    return priority;
}

public void setPriority(int priority) {
    this.priority = priority;
}
```

4. עדכן את `toString()` כדי להציג את priority:
```java
@Override
public String toString() {
    return name + " (x" + quantity + ", priority: " + priority + ")" + (purchased ? " ✓" : "");
}
```

**שלב 4.2: עדכן ShoppingList.java**

1. הוסף מתודה חדשה שמסדרת לפי priority (בסוף המחלקה):

```java
public List<ShoppingItem> getSortedByPriority() {
    List<ShoppingItem> sorted = new ArrayList<>(items);
    sorted.sort((item1, item2) -> Integer.compare(item2.getPriority(), item1.getPriority()));
    // Note: item2 comes before item1, so higher priority comes first
    return sorted;
}
```

2. אם תרצה, הוסף גם מתודה שמסדרת לפי שם (bonus):

```java
public List<ShoppingItem> getSortedByName() {
    List<ShoppingItem> sorted = new ArrayList<>(items);
    sorted.sort((item1, item2) -> item1.getName().compareTo(item2.getName()));
    return sorted;
}
```

**שלב 4.3: עדכן MainActivity.java (Optional)**

אם יש TODOs בקוד, בצע אותם כדי להציג את priority בממשק.

---

### שלב 5: עדכן את ה-UML | Step 5: Update UML Diagrams

**שינויים ל-Class Diagram:**

1. פתח את הקובץ `class-diagram-initial.png` ב-draw.io (או צור חדש)
2. עדכן את ה-ShoppingItem box:
   - הוסף שדה חדש: `- priority: int`
   - עדכן את ה-constructor: `+ ShoppingItem(String, int, int)`
   - הוסף getter ו-setter: `+ getPriority(): int`, `+ setPriority(int)`
   - עדכן `toString()` אם צריך

3. עדכן את ה-ShoppingList box:
   - הוסף מתודה חדשה: `+ getSortedByPriority(): List<ShoppingItem>`
   - (optional) `+ getSortedByName(): List<ShoppingItem>`

4. שמור:
   - File → Download as → PNG
   - שם הקובץ: `class-diagram-updated.png`

**שינויים ל-Activity Diagram:**

1. (Optional) צור Activity Diagram חדש עבור "Sort by Priority" flow אם רצוי
2. או עדכן את ה-Activity Diagram הקיים כדי להוסיף step:
   - לאחר "Display list on screen"
   - הוסף decision: "User wants to sort by priority?"
   - אם כן: "Call getSortedByPriority()"
   - אם לא: מסיים

---

### שלב 6: קומיט לGitHub | Step 6: Commit to GitHub

1. הוסף את הקבצים לtracking:
```bash
git add app/src/main/java/com/example/shoppinglist/*.java
git add class-diagram-*.png
git add activity-diagram-*.png
```

2. כתוב commit message:
```bash
git commit -m "Lesson 07: Add priority field to ShoppingItem and update UML diagrams"
```

3. דחוף ל-repository:
```bash
git push origin main
```

---

### שלב 7: מלא את OBSERVATIONS.md ו-QUESTIONS.md | Step 7: Complete Reflection Files

1. פתח את `OBSERVATIONS.md` ותעד את ההערות שלך
2. פתח את `QUESTIONS.md` וענה על 5 השאלות התיאוריות

---

## Checklist סיום | Completion Checklist

- [ ] קראתי את כל הקוד Java ויודע למה כל מחלקה
- [ ] צללתי Class Diagram לקוד המקורי (שתי מחלקות + קשר)
- [ ] צללתי Activity Diagram לתהליך "הוספת פריט"
- [ ] הוספתי שדה `priority` ל-ShoppingItem
- [ ] עדכנתי את ה-constructor של ShoppingItem
- [ ] הוספתי getPriority() ו-setPriority()
- [ ] עדכנתי את toString()
- [ ] הוספתי getSortedByPriority() ל-ShoppingList
- [ ] עדכנתי את ה-Class Diagram (שתי תמונות PNG)
- [ ] (Optional) עדכנתי את ה-Activity Diagram
- [ ] קומיטתי את הקוד ל-GitHub
- [ ] קומיטתי את התרשימים (PNG files)
- [ ] מלאתי את OBSERVATIONS.md
- [ ] עניתי על השאלות ב-QUESTIONS.md

---

## טיפים | Tips

1. **צור Diagram לפני שמבינים:**
   - אם לא בטוח איך תרשום משהו, שאל את הGem ("How do I show...")

2. **save frequently:**
   - שמור את התרשים כל כמה דקות

3. **Commit early, commit often:**
   - כל שינוי גדול = commit חדש

4. **Compare:**
   - תרשמו לפני ואחרי כדי לראות את ההבדל

5. **Ask the Gem:**
   - If stuck on UML or draw.io, ask the Gem in English
   - Gem will respond in Hebrew

---

## עזרה | Help

- **שאלות על UML?** → שאל את Google Gem
- **שאלות על draw.io?** → draw.io tutorials: https://www.draw.io/
- **שאלות על Java?** → בדוק את הTutorials או שאל בשיעור
- **שאלות אחרות?** → שלח דוא"ל למורה: noam.lessner@a-y.org.il

---

**תאריך סיום:** [הכנס תאריך כאן]
**תאריך הגשה אחרון:** [הכנס תאריך כאן]

בהצלחה! 🚀
