package io.springbatch.springbatchlecture;

import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.LineTokenizer;

public class DefaultLineMapper<T> implements LineMapper<T> {

    private LineTokenizer tokenizer;
    private FieldSetMapper<T> fieldSetMapper;

    @Override
    public T mapLine(String line, int lineNumber) throws Exception {
        return fieldSetMapper.mapFieldSet(tokenizer.tokenize(line));
    }

    public void setLineTokenize(LineTokenizer lineTokenizer){
        this.tokenizer = lineTokenizer;
    }

    public void setFieldSetMapper(FieldSetMapper fieldSetMapper){
        this.fieldSetMapper = fieldSetMapper;
    }
}
