package com.devtau.organizer.model;

import java.util.Comparator;
/**
 * Компараторы необходимы, если вы собираетесь сортировать лист объектов этого класса
 * ответ <0 говорит о том, что сравнение не прошло проверку и нужна перестановка
 */
public class PhotoSessionComparators {
    public static Comparator<PhotoSession> FIRST_OLD = new Comparator<PhotoSession>() {
        @Override
        public int compare(PhotoSession first, PhotoSession second) {
            long firstLong = first.getPhotoSessionDate().getTimeInMillis();
            long secondLong = second.getPhotoSessionDate().getTimeInMillis();
            int result;
            if (firstLong < secondLong) result = -1;
            else if (firstLong == secondLong) result = 0;
            else result = 1;
            return result;
        }
    };

    public static Comparator provideComparator(int indexOfSortMethod) {
        return FIRST_OLD;
    }
}
