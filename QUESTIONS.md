# 5 שאלות תיאוריות | 5 Theoretical Questions

שם התלמיד / Student Name: ___________________________

תאריך / Date: ___________________________

---

## שאלה 1: UML ויעדיה

### 📋 The Question

**בעברית:**
UML (Unified Modeling Language) היא שפה ויזואלית לתכנון תוכנה. הסבר: מדוע מהנדסי תוכנה משתמשים ב-UML כדי לתכנן את המערכת **קודם** שהם כותבים את הקוד?

**In English:**
UML (Unified Modeling Language) is a visual language for software design. Explain: Why do software engineers use UML to plan the system **before** they write the code?

---

### ✍️ Your Answer

```
תשובתי:




```

---

### ✓ Grading Checklist

- [ ] הסברת מה זה UML בקצרה
- [ ] הצגת לפחות 2 יתרונות לשימוש ב-UML קודם כתיבת קוד
- [ ] נתת דוגמה מהעולם האמיתי או מה-ShoppingList תרגיל
- [ ] ניסוח ברור בעברית עם מונחים טכניים נכונים

---

## שאלה 2: Composition vs. Aggregation

### 📋 The Question

**בעברית:**
מה ההבדל בין Composition (יהלום מלא ◆) לבין Aggregation (יהלום ריק ◇) בתרשים Class Diagram? תן דוגמה לשניהם.

**In English:**
What is the difference between Composition (filled diamond ◆) and Aggregation (empty diamond ◇) in a Class Diagram? Give an example for each.

---

### ✍️ Your Answer

```
Composition (◆):
    הסבר:

    דוגמה:



Aggregation (◇):
    הסבר:

    דוגמה:



```

---

### ✓ Grading Checklist

- [ ] הסברת בבירור מה Composition
- [ ] הסברת בבירור מה Aggregation
- [ ] נתת דוגמה שונה לכל אחד
- [ ] הסברת מתי כל אחד משמש

---

## שאלה 3: קריאת Class Diagram

### 📋 The Question

**בעברית:**
נתון תרשים Class Diagram זה:

```
┌──────────────────────────┐
│    ShoppingList          │
├──────────────────────────┤
│ - listName: String       │
│ - items: List<...>       │
├──────────────────────────┤
│ + addItem(ShoppingItem)  │
│ + getItems(): List<...>  │
│ + getTotalItems(): int   │
└──────────────────────────┘
         1     ◆     *
          └─────┘─────┘
┌──────────────────────────┐
│   ShoppingItem           │
├──────────────────────────┤
│ - name: String           │
│ - quantity: int          │
│ - purchased: boolean     │
├──────────────────────────┤
│ + getName(): String      │
│ + getQuantity(): int     │
│ + isPurchased(): boolean │
└──────────────────────────┘
```

שאלות:
1. אילו שדות ב-ShoppingList הם private?
2. כמה instances של ShoppingItem יכולות להיות ב-ShoppingList אחד?
3. למה יש יהלום מלא (◆) בקשר הזה?

**In English:**
Given this Class Diagram (shown above), answer:
1. Which fields in ShoppingList are private?
2. How many instances of ShoppingItem can be in one ShoppingList?
3. Why is there a filled diamond (◆) in this relationship?

---

### ✍️ Your Answer

```
1. השדות הprivate ב-ShoppingList:



2. כמה ShoppingItem instances יכולות להיות:



3. למה יהלום מלא (◆)?





```

---

### ✓ Grading Checklist

- [ ] זיהית את כל ה-private fields (- סימן)
- [ ] הצגת את multiplicity "*" בהסבר (אפס או יותר)
- [ ] הסברת בהיגיון למה זו Composition

---

## שאלה 4: Activity Diagram — סדר הצעדים

### 📋 The Question

**בעברית:**
צור Activity Diagram ל"משתמש מסיר פריט מהרשימה" עם התנאים הבאים:
- משתמש בוחר פריט
- אם הפריט קיים: הסר אותו והצג את הרשימה המעודכנת
- אם הפריט לא קיים: הצג שגיאה

צייר או תאר בטקסט (בתרשים ASCII או בתיאור מילולי).

**In English:**
Create an Activity Diagram for "User removes an item from the shopping list" with these conditions:
- User selects an item
- If item exists: remove it and display updated list
- If item doesn't exist: show error

Draw or describe in text (ASCII diagram or verbal description).

---

### ✍️ Your Answer

```
התרשים שלי:

┌─────────────────┐
│  [Start]        │
└────────┬────────┘
         │
         ▼


(התמשך בציור או תיאור כאן)




```

---

### ✓ Grading Checklist

- [ ] התחלת עם [Start]
- [ ] הסיימת עם [End]
- [ ] הצגת את ה-selection צעד
- [ ] הצגת decision (יהלום) עם קונדיציה
- [ ] הצגת שני מסלולים (item exists / doesn't exist)
- [ ] כל מסלול מסתיים בערך סביר

---

## שאלה 5: עדכון UML כשהקוד משתנה

### 📋 The Question

**בעברית:**
בתרגיל, הוספת שדה `priority` ל-ShoppingItem וגם מתודה `getSortedByPriority()` ל-ShoppingList.

שאלות:
1. אילו שינויים עשית לתרשים ה-Class Diagram של ShoppingItem?
2. אילו שינויים עשית לתרשים ה-Class Diagram של ShoppingList?
3. למה חשוב לעדכן את ה-UML כשהקוד משתנה?

**In English:**
In the exercise, you added a `priority` field to ShoppingItem and a `getSortedByPriority()` method to ShoppingList.

Questions:
1. What changes did you make to the Class Diagram of ShoppingItem?
2. What changes did you make to the Class Diagram of ShoppingList?
3. Why is it important to update the UML when the code changes?

---

### ✍️ Your Answer

```
1. שינויים לShoppingItem:
   - הוספתי שדה:
   - הוספתי getter:
   - הוספתי setter:
   - (שינויים נוספים):



2. שינויים לShoppingList:
   - הוספתי מתודה:
   - (שינויים נוספים):



3. חשיבות עדכון UML:





```

---

### ✓ Grading Checklist

- [ ] ציינת את הנוסף ל-ShoppingItem בתוך קופסא
- [ ] ציינת את הנוסף ל-ShoppingList בתוך קופסא
- [ ] כתבת קונספציה נכונה (visibility + name : type)
- [ ] הסברת למה חשוב לעדכן (communication, documentation, etc.)

---

## סיכום ניקוד | Grading Summary

| שאלה | ניקוד | הערות |
|---|---|---|
| שאלה 1 | __/20 | |
| שאלה 2 | __/20 | |
| שאלה 3 | __/20 | |
| שאלה 4 | __/20 | |
| שאלה 5 | __/20 | |
| **סה"כ** | **__/100** | |

---

## פקס — הערות המורה | Teacher Notes

(למורה בלבד / For teacher only)

```
הערות:


תאריך בדיקה / Grading Date: ______________
חתימת המורה / Teacher Signature: ______________
```

---

**תאריך הגשה / Submission Date:** ___________________________

**חתימת התלמיד / Student Signature:** ___________________________

---

*בהצלחה! Good Luck!* 🎓
