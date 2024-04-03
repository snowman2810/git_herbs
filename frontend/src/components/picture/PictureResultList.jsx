import styled from 'styled-components';
import PictureResultListItem from './PictureResultListItem';
import { useState } from 'react';

const ListWrapper = styled.ul`
  list-style: none;
  padding: 0;
  margin: 0;
`;

const EmptyMessage = styled.p`
  text-align: center;
  font-size: 18px;
  color: #888;
`;

const PictureResultList = ({ items, img, onItemClick }) => {
  const [count, setCount] = useState(0);
  const [herbId, setHerbId] = useState();
  const clicked = (data) => {
    if (count === 0) {
      setHerbId(data)
    }
    setCount(count + 1)
    onItemClick();
  }
  if (!items || items.length === 0) {
    return <EmptyMessage>검색 결과가 없습니다.</EmptyMessage>;
  }
  return (
    <ListWrapper className='bold'>
      <h2>사진 판별 결과</h2>
      {items.map((item, index) => (
        <PictureResultListItem key={index} item={item} index={index + 1} count={count} herbId={herbId} img={img} onItemClick={clicked} />
      ))}
    </ListWrapper>
  );
};

export default PictureResultList;