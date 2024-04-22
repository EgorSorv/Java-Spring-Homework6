package ru.gb.Homework6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.Homework6.model.Note;

import java.util.Optional;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    // переопределенный поиск заметки по id
    @Override
    Optional<Note> findById(Long id);
}
