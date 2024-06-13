Применён Interface Segregation Principle. Создан дополнительный интерфейс SortStudentGroup,  который наследуются от StudentSortService

Применён Open closed Principle. Создан абстрактный класс StudentGroupQueryService и его наследники: StudentSort, StudentSearch

Применён Single Responsibility Principle. Класс StudentGroupService разбит на отдельные классы