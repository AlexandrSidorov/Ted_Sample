# Ted_Sample
Не переделывались классы моделей в удобоваримые. 
Для экономии времени все прогонялось через http://www.jsonschema2pojo.org/. 
Соответственно, поэтому классы не Parceable (мутная структура, проще сделать Serializable, хоть это и медленнее).

Без рефакторинга.
Обработка ошибок реализована не везде - время.
Дизайн - применялась базовая настройка темы, без drawable и анимации.
В данном случае всего 2 activity, поэтому фрагменты не использую.
Иконки, названия и т.п. полагаю, что не принципиально - все по дефолту.
