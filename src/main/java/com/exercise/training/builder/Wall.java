package com.exercise.training.builder;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure {
    private List<CompositeBlock> blocks;

    @Override
    public Optional<Block> findBlockByColor(String color) {
        if(!color.isEmpty() && !blocks.isEmpty()) {
            return blocks.stream()
                    .flatMap(compositeBlock -> compositeBlock.getBlocks().stream())
                    .filter(block -> block.getColor().equals(color))
                    .findAny();
        }
        return Optional.empty();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        if(!material.isEmpty() && !blocks.isEmpty()) {
            return blocks.stream()
                    .flatMap(compositeBlock -> compositeBlock.getBlocks().stream())
                    .filter(block -> block.getMaterial().equals(material))
                    .collect(Collectors.toList());
        }
        return Collections.emptyList();
    }

    @Override
    public int count() {
        if(!blocks.isEmpty()) {
            return (int)blocks.stream()
                    .flatMap(compositeBlock -> compositeBlock.getBlocks().stream())
                    .count();
        }
        return 0;
    }
}
